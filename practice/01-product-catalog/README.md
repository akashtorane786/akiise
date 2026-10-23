# Mini Project 01: Product Catalog API

Spring Boot + PostgreSQL API that returns products from a database.

## What I learned
- Table design: primary keys, foreign keys, CHECK rules, NUMERIC for money
- How controller, repository and entity work together in Spring Boot
- Keeping passwords out of Git with .gitignore

## Run it
1. Create database `practice_catalog` and run `db/schema.sql`, then `db/seed.sql`
2. Create `product-catalog/src/main/resources/application.properties` with your own database URL, username and password
3. In `product-catalog`, run `.\mvnw spring-boot:run`
4. Open http://localhost:8080/products

## Next
- Add GET /products/{id}, categories, pagination and filters