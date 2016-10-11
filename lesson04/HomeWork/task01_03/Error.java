package lesson04.HomeWork.task01_03;

public class Error {

	private int code;

	public Error() {
	}

	public Error(int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public HttpError cont() {
		HttpError httpError = null;
		switch (code) {
		case 400:
			httpError = HttpError.BAD_REQUEST;
			break;
		case 401:
			httpError = HttpError.UNAUTHORIZED;
			break;
		case 402:
			httpError = HttpError.PAYMENT_REQUIRED;
			break;
		case 403:
			httpError = HttpError.FORBIDDEN;
			break;
		case 404:
			httpError = HttpError.NOT_FOUND;
			break;
		case 405:
			httpError = HttpError.METHOD_NOT_ALLOWED;
			break;
		case 406:
			httpError = HttpError.NOT_ACCEPTABLE;
			break;
		case 407:
			httpError = HttpError.PROXY_AUTHENTICATION_REQUIRED;
			break;
		case 408:
			httpError = HttpError.REQUEST_TIMEOUT;
			break;
		case 409:
			httpError = HttpError.CONFLICT;
			break;
		case 410:
			httpError = HttpError.GONE;
			break;
		case 411:
			httpError = HttpError.LENGTH_REQUIRED;
			break;
		case 412:
			httpError = HttpError.PRECONDITION_FAILED;
			break;
		case 413:
			httpError = HttpError.REQUEST_ENTITY_TOO_LARGE;
			break;
		case 414:
			httpError = HttpError.REQUEST_URI_TOO_LONG;
			break;
		case 415:
			httpError = HttpError.UNSUPPORTED_MEDIA_TYPE;
			break;
		case 416:
			httpError = HttpError.REQUESTED_RANGE_NOT_SATISFIABLE;
			break;
		case 417:
			httpError = HttpError.EXPECTATION_FAILED;
			break;
		}
		return httpError;

	}

}
