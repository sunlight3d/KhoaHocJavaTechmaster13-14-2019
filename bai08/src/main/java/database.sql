-- Tao 1 table
-- SQL = Structure Query Language
USE testdb;
CREATE TABLE tblProduct(
    productId INT PRIMARY KEY AUTO_INCREMENT,
    productName VARCHAR(500) NOT NULL,
    price FLOAT DEFAULT 0.0
);
-- DROP table - careful!!!, if data is BLANK
DROP TABLE tblProduct;
DESCRIBE tblProduct;
-- Insert data
INSERT INTO tblProduct(productName, price)
VALUES("iphone X", 120.22);
INSERT INTO tblProduct(productName, price)
VALUES("iphone 6", 122.22);
INSERT INTO tblProduct(productName, price)
VALUES("iphone 7", 133.33);

--Query data for checking:
SELECT * FROM tblProduct;
SELECT COUNT(*) FROM tblProduct;

UPDATE tblProduct
SET productName="iphone XX", price=999.2
WHERE productId=1;

UPDATE tblProduct
SET productName="iphone 66", price=333.3
WHERE productId=2;

DELETE FROM tblProduct WHERE productId=3;

