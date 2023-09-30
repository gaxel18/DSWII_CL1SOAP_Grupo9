CREATE TABLE Pacientes (
    idPaciente INT AUTO_INCREMENT PRIMARY KEY,
    nomPaciente VARCHAR(255) NOT NULL,
    apePaciente VARCHAR(255) NOT NULL,
    docPaciente VARCHAR(100) NOT NULL,
    fechaNacPaciente DATE,
    emailPaciente VARCHAR(255)
);