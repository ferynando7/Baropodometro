CREATE TABLE BaropSample (id SERIAL NOT NULL, idPatient varchar(10) NOT NULL, sampleDate timestamp NOT NULL, sensorData text NOT NULL, PRIMARY KEY (id));
CREATE TABLE Patient (id varchar(10) NOT NULL, firstName varchar(30) NOT NULL, lastName varchar(30) NOT NULL, genre char(1) NOT NULL, birthDate date NOT NULL, heigth int4 NOT NULL, weight numeric(5, 2) NOT NULL, phone varchar(25), email varchar(50), PRIMARY KEY (id));
CREATE TABLE PatientRecord (id SERIAL NOT NULL, idPatient varchar(10) NOT NULL, idImage int4 NOT NULL, diagnosis text NOT NULL, medication text NOT NULL, dateAnalysis date NOT NULL, PRIMARY KEY (id));
ALTER TABLE PatientRecord ADD CONSTRAINT FKPatientRec163525 FOREIGN KEY (idPatient) REFERENCES Patient (id);
ALTER TABLE BaropSample ADD CONSTRAINT FKBaropSampl560918 FOREIGN KEY (idPatient) REFERENCES Patient (id);
ALTER TABLE PatientRecord ADD CONSTRAINT FKPatientRec816807 FOREIGN KEY (idImage) REFERENCES BaropSample (id);

