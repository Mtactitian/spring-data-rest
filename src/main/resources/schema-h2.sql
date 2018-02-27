CREATE TABLE ORGANIZER
(
  ID int  generated always as identity ,
  NAME varchar(20)  NOT NULL,
  CREATED TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (ID)
);


CREATE TABLE VENUE
(
  ID         int  generated always as identity ,
  CREATED    TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  NAME       varchar(256),
  STREET_ADDRESS    varchar(256),
  STREET_ADDRESS2   varchar(256),
  CITY              varchar(256),
  STATE             varchar(256),
  COUNTRY           VARCHAR(256),
  POSTAL_CODE       varchar(256),
  PRIMARY KEY (ID)
);


CREATE TABLE EVENT
(
  ID              int	 generated always as identity ,
  CREATED         TIMESTAMP    DEFAULT CURRENT_TIMESTAMP,
  NAME            varchar(256),
  DESCRIPTION     varchar(2048),
  START_TIME      TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  END_TIME        TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  ZONE_ID         int,
  STARTED         int,
  ORGANIZER_ID    int,
  VENUE_ID        int,
  PRIMARY KEY (ID),
   FOREIGN KEY (ORGANIZER_ID) REFERENCES ORGANIZER(ID) ON DELETE CASCADE,
  FOREIGN KEY (VENUE_ID) REFERENCES VENUE(ID)
);


CREATE TABLE PARTICIPANT
(
  ID  	int        generated always as identity ,
  CREATED    TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  NAME      varchar(256) NOT NULL,
  EMAIL      varchar(256) NOT NULL,
  CHECKED_IN   int,
  EVENT_ID    int        NOT NULL,
  PRIMARY KEY (ID),
  FOREIGN KEY (EVENT_ID) REFERENCES venue(ID),
  UNIQUE (EVENT_ID, EMAIL)
);