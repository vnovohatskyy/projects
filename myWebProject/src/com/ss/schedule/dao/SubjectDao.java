package com.ss.schedule.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ss.schedule.model.Subject;
import com.ss.schedule.model.SubjectType;

public class SubjectDao extends AbstractDao<Subject> {

	public SubjectDao(){
		createTable();
	}
	
	private void createTable() {
		String sql = "CREATE TABLE IF NOT EXISTS SUBJECTS " + "(ID SERIAL NOT NULL PRIMARY KEY,"
				+ " NAME TEXT NOT NULL, " + " SUBJECT_TYPE TEXT NOT NULL, " + " COURSE INT NOT NULL)";
		try {
			Statement create = connection.createStatement();
			create.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void addAll(ArrayList<Subject> listOfSubjects) {
		for (int i = 0; i < listOfSubjects.size(); i++) {
			try {
				PreparedStatement ps = connection
						.prepareStatement("INSERT INTO SUBJECTS (NAME, SUBJECT_TYPE, COURSE) VALUES(?,?,?)");

				ps.setString(1, listOfSubjects.get(i).getName());
				ps.setString(2, listOfSubjects.get(i).getType().toString());
				ps.setInt(3, listOfSubjects.get(i).getCourse());
				ps.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public Subject add(Subject entity) {
		try {
			PreparedStatement s = connection
					.prepareStatement("INSERT INTO SUBJECTS (NAME, SUBJECT_TYPE, COURSE) VALUES(?,?,?)");
			s.setString(1, entity.getName());
			s.setString(2, entity.getType().toString());
			s.setInt(3, entity.getCourse());
			s.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return entity;
	}

	@Override
	public List<Subject> getAll() {
		ArrayList<Subject> subjects = new ArrayList<>();
		ResultSet rs = null;
		try {
			rs = connection.createStatement().executeQuery("SELECT ID, NAME, SUBJECT_TYPE, COURSE FROM SUBJECTS");
			while (rs.next()) {
				int subjectID = rs.getInt("ID");
				String subjectName = rs.getString("NAME");
				String subjectType = rs.getString("SUBJECT_TYPE");
				int subjectCourse = rs.getInt("COURSE");
				Subject subject = new Subject();
				subject.setID(subjectID);
				subject.setName(subjectName);
				subject.setType(SubjectType.valueOf(subjectType));
				subject.setCourse(subjectCourse);
				subjects.add(subject);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return subjects;
	}

	@Override
	public Subject getById(long id) {
		Subject subject = new Subject();
		try {
			PreparedStatement ps = connection
					.prepareStatement("SELECT NAME, SUBJECT_TYPE, COURSE FROM SUBJECTS WHERE ID=?");
			ps.setLong(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				String subjectName = rs.getString("NAME");
				String subjectType = rs.getString("SUBJECT_TYPE");
				int subjectCourse = rs.getInt("COURSE");
				subject.setID((int) id);
				subject.setName(subjectName);
				subject.setType(SubjectType.valueOf(subjectType));
				subject.setCourse(subjectCourse);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return subject;
	}

	@Override
	public Subject update(Subject entity) {
		try {
			PreparedStatement ps = connection
					.prepareStatement("UPDATE SUBJECTS SET NAME=?, SUBJECT_TYPE=?, COURSE=? WHERE ID=?");
			ps.setString(1, entity.getName());
			ps.setString(2, entity.getType().toString());
			ps.setInt(3, entity.getCourse());
			ps.setInt(4, entity.getId());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return entity;
	}

	@Override
	public boolean delete(long id) {
		String sql = "DELETE FROM SUBJECTS WHERE ID=?";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setLong(1, id);
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
}
