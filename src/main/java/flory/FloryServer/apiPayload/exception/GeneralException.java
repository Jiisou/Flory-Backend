package flory.FloryServer.apiPayload.exception;

import flory.FloryServer.apiPayload.code.BaseErrorCode;
import flory.FloryServer.apiPayload.code.ErrorReasonDTO;
import lombok.*;
@Getter
@AllArgsConstructor
public class GeneralException extends RuntimeException {

    private BaseErrorCode code;

    public ErrorReasonDTO getErrorReason() {
        return this.code.getReason();
    }

    public ErrorReasonDTO getErrorReasonHttpStatus(){
        return this.code.getReasonHttpStatus();
    }
}
