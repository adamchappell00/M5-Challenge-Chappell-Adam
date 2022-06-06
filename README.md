### Execution Instructions

1. Clone and Open Each Service Below as a Project
   1. GameStoreServiceRegistry
   2. gamestore-catalog
   3. gamestore-invoicing
2. Update the Application Properties:
   1. Copy or Rename the 'example.properties file' for each of the projects (within the src/main/resources directory) into an 'application.properties' file
   2. Update the following values for the gamestore-catalog and the gamestore-invoicing applications within their respective application.properties:
      - spring.datasource.username:[YOUR_DB_USERNAME]
      - spring.datasource.password:[YOUR_DB_PASSWORD]
3. Set up the schema and data:
   1. For both the gamestore-catalog and gametore-invoicing services, run the schema.sql script, and then run the data.sql script. Both are Located in the sql directory in the root of their parent project directory.
4. Start and Run the Applications in the following order:
   1. First: ServiceRegistry
   2. Second: Gamestore-Catalog
   3. Third: Gamestore-Invoicing
   