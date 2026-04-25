სათაური: Class Activity (Quiz) - I
აღწერა:

1. Create a Product entity
   Create a JPA entity class called Product mapped to the table products. It must have:

- id (Long, auto-generated primary key)
- name (String, not nullable, max 100 chars)
- price (BigDecimal, not nullable)
- category (String)
- createdAt (LocalDateTime, set automatically before persist)
  . Map a one-to-many relationship

2. You have two entities: Author and Book. Create both classes so that:

- One Author can have many Books (bidirectional)
- The books collection is lazily loaded
- Book has a ManyToOne back-reference to Author
- The foreign key column in books table is named author_id

3. Write a JPQL search query

In an OrderRepository, write a Spring Data method that:

- Accepts a String customerName and an OrderStatus status
- Returns all Orders where the customer name contains the given string (case-insensitive) AND the status matches
- Results must be ordered by createdAt descending

4. JOIN FETCH to avoid N+1
   Write a repository method that loads all Department entities and eagerly fetches their employees collection in a single SQL query. Without JOIN FETCH this would trigger N+1 queries.

5. Interface-based projection.
   The full Employee entity has many fields. Create an interface-based projection called EmployeeSummary that exposes only id, firstName, lastName, and email. Then add a repository method that returns all employees as this projection.
6. DTO (class-based) projection with @Query
   Create a DTO class called ProductStats that holds category (String) and averagePrice (Double). Then write a JPQL query in ProductRepository that returns average price grouped by category as a list of ProductStats.
   Hint:
   Given context
   @Entity
   @Table(name = "products")
   public class Product {
   @Id Long id;
   String name;
   BigDecimal price;
   String category;
   }

კვირა: 6
დაწყების თარიღი: 2026-04-22 00:00:00
დასრულების თარიღი: 2026-04-29 00:00:00

default
Arial
3

Clear Class

///\* answers to questions

1. - createdAt (LocalDateTime, set automatically before persist)

jpa specifies seven optioinal lifecycle events.
before persist is called for new entity @PrePersist
