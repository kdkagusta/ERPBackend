package app.service.ERP.utilities.verify;

public interface IVerifiadService {

    void sendVerificationCode(String email);

    String codeGenerator();
}
