create table Hospital (
  id    serial not null, 
  name varchar(255) not null, 
  primary key (id));
create table PatientRecord (
  id          serial not null, 
  idPatient  int4 not null, 
  idDoctor   int4 not null, 
  idImage    int4 not null, 
  diagnosis  varchar(255) not null, 
  medication varchar(255) not null, 
  primary key (id));
create table BarSample (
  id          serial not null, 
  idPatient  int4 not null, 
  sampleDate date not null, 
  sensorData varchar(255) not null, 
  primary key (id));
create table Doctor (
  id          serial not null, 
  idHospital int4 not null, 
  firstName  varchar(255) not null, 
  lastName   varchar(255) not null, 
  phone      varchar(255), 
  primary key (id));
create table Patient (
  id                 serial not null, 
  firstName         varchar(255) not null, 
  lastName          varchar(255) not null, 
  genre             char(255) not null, 
  fecNac            date not null, 
  altura            int4 not null, 
  peso              numeric(5, 2) not null, 
  phone             varchar(255), 
  email             varchar(255), 
  currentDiagnosis  varchar(255), 
  currentMedication varchar(255), 
  primary key (id));


alter table Doctor add constraint FKDoctor492211 foreign key (idHospital) references Hospital (id);
alter table PatientRecord add constraint FKPatientRec412407 foreign key (idDoctor) references Doctor (id);
alter table PatientRecord add constraint FKPatientRec163525 foreign key (idPatient) references Patient (id);
alter table BarSample add constraint FKBarSample947324 foreign key (idPatient) references Patient (id);
alter table PatientRecord add constraint FKPatientRec203214 foreign key (idImage) references BarSample (id);
