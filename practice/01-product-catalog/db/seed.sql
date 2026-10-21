INSERT INTO categories (name) VALUES
('Fruits & Vegetables'), ('Dairy & Eggs'), ('Snacks'), ('Beverages');

INSERT INTO products (category_id, name, description, price, mrp, unit, stock_quantity) VALUES
(1, 'Banana', 'Fresh robusta bananas', 45.00, 50.00, '1 dozen', 40),
(1, 'Tomato', 'Farm fresh tomatoes', 30.00, 35.00, '500 g', 60),
(2, 'Milk', 'Full cream milk', 34.00, 34.00, '500 ml', 80),
(2, 'Eggs', 'White eggs', 78.00, 84.00, '12 pcs', 50),
(3, 'Potato Chips', 'Classic salted', 20.00, 20.00, '50 g', 100),
(4, 'Cola', 'Chilled cola', 40.00, 45.00, '750 ml', 70);