# Thêm dữ liệu vào app_role
INSERT INTO app_role (role) VALUES ('ADMIN');
INSERT INTO app_role (role) VALUES ('USER');

# Thêm dữ liệu vào user
INSERT INTO app_user (username, password, role_id) values ('admin', 123, 1);
INSERT INTO app_user (username, password, role_id) values ('dung', 123, 2);
INSERT INTO app_user (username, password, role_id) values ('thu', 123, 2);

# Thêm dữ liệu vào brand
INSERT INTO brand (brand_id, name) VALUES
                                 (1, 'Samsung'),
                                 (2, 'Apple'),
                                 (3, 'Xiaomi'),
                                 (4, 'Oppo'),
                                 (5, 'Vivo');

-- Samsung
INSERT INTO phone (name, capacity, ram, color, price, origin, brand_id, imgURL)
VALUES
    ('Samsung Galaxy S21 FE', 128, 8, 'Black', 8800000, 'Korea', 1, '/Images/Samsung/Samsung_Galaxy_S21_FE.webp'),
    ('Samsung Galaxy S21 Ultra 5G', 256, 12, 'Silver', 30990000, 'Korea', 1, '/Images/Samsung/Samsung_Galaxy_S21_Ultra_5G.webp'),
    ('Samsung Galaxy Note 20', 128, 8, 'Mystic Bronze', 8190000, 'Korea', 1, '/Images/Samsung/Samsung_Galaxy_Note_20.webp'),
    ('Samsung Galaxy A52', 128, 6, 'Purple', 9290000, 'Korea', 1, '/Images/Samsung/Samsung_Galaxy_A52.webp'),
    ('Samsung Galaxy A72', 256, 8, 'White', 11490000, 'Korea', 1, '/Images/Samsung/Samsung_Galaxy_A72.webp'),
    ('Samsung Galaxy Z Fold 3', 512, 12, 'Phantom Black', 44990000, 'Korea', 1, '/Images/Samsung/Samsung_Galaxy_Z_Fold_3.webp'),
    ('Samsung Galaxy Z Flip 3', 128, 8, 'Purple', 5690000, 'Korea', 1, '/Images/Samsung/Samsung_Galaxy_Z_Flip_3.webp'),
    ('Samsung Galaxy S20 FE', 128, 8, 'Green', 7200000, 'Korea', 1, '/Images/Samsung/Samsung_Galaxy_S20_FE.webp'),
    ('Samsung Galaxy A32', 64, 4, 'Black', 6490000, 'Korea', 1, '/Images/Samsung/Samsung_Galaxy_A32.webp'),
    ('Samsung Galaxy M32', 128, 6, 'Light Blue', 3590000, 'Korea', 1, '/Images/Samsung/Samsung_Galaxy_M32.webp'),
    ('Samsung Galaxy A02', 32, 3, 'Black', 1190000, 'Korea', 1, '/Images/Samsung/Samsung_Galaxy_A02.webp'),
    ('Samsung Galaxy M12', 64, 4, 'Green', 9190000, 'Korea', 1, '/Images/Samsung/Samsung_Galaxy_M12.webp'),
    ('Samsung Galaxy F41', 64, 6, 'Blue Light', 3740000, 'Korea', 1, '/Images/Samsung/Samsung_Galaxy_F41.webp'),
    ('Samsung Galaxy A21s', 64, 4, 'Blue', 4690000, 'Korea', 1, '/Images/Samsung/Samsung_Galaxy_A21s.webp'),
    ('Samsung Galaxy A11', 32, 3, 'Black', 2990000, 'Korea', 1, '/Images/Samsung/Samsung_Galaxy_A11.webp');

-- Apple
INSERT INTO phone (name, capacity, ram, color, price, origin, brand_id, imgURL)
VALUES
    ('iPhone 13', 128, 6, 'Pink', 13890000, 'USA', 2, '/Images/Apple/iPhone_13.webp'),
    ('iPhone 13 Pro', 256, 6, 'Graphite', 16190000, 'USA', 2, '/Images/Apple/iPhone_13_Pro.webp'),
    ('iPhone 13 Pro Max', 512, 6, 'Gold', 17190000, 'USA', 2, '/Images/Apple/iPhone_13_Pro_Max.webp'),
    ('iPhone 12', 128, 6, 'Blue', 8490000, 'USA', 2, '/Images/Apple/iPhone_12.webp'),
    ('iPhone 12 Mini', 64, 4, 'Red', 12490000, 'USA', 2, '/Images/Apple/iPhone_12_Mini.webp'),
    ('iPhone SE (2020)', 64, 3, 'White', 4490000, 'USA', 2, '/Images/Apple/iPhone_SE_(2020).webp'),
    ('iPhone 11', 64, 4, 'Purple', 8890000, 'USA', 2, '/Images/Apple/iPhone_11.webp'),
    ('iPhone 11 Pro', 256, 6, 'Midnight Green', 11190000, 'USA', 2, '/Images/Apple/iPhone_11_Pro.webp'),
    ('iPhone 11 Pro Max', 512, 6, 'Space Gray', 11190000, 'USA', 2, '/Images/Apple/iPhone_11_Pro_Max.webp'),
    ('iPhone 14', 128, 4, 'Yellow', 15990000, 'USA', 2, '/Images/Apple/iPhone_14.webp'),
    ('iPhone 14 Plus', 128, 4, 'Black', 19690000, 'USA', 2, '/Images/Apple/iPhone_14_Plus.webp'),
    ('iPhone 14 Pro', 256, 6, 'Space Black', 21390000, 'USA', 2, '/Images/Apple/iPhone_14_Pro.webp'),
    ('iPhone 14 Pro Max', 512, 6, 'Gold', 1099.99, 'USA', 2, '/Images/Apple/iPhone_14_Pro_Max.webp'),
    ('iPhone 15', 128, 4, 'Pink', 18990000, 'USA', 2, '/Images/Apple/iPhone_15.webp'),
    ('iPhone 16', 128, 4, 'Blue', 21490000, 'USA', 2, '/Images/Apple/iPhone_16.webp');

-- Xiaomi
INSERT INTO phone (name, capacity, ram, color, price, origin, brand_id, imgurl)
VALUES
    ('Xiaomi Mi 11', 128, 8, 'Black', 15200000, 'China', 3, '/Images/Xiaomi/Xiaomi_Mi_11.webp'),
    ('Xiaomi Mi 11 Ultra', 256, 12, 'White', 5600000, 'China', 3, '/Images/Xiaomi/Xiaomi_Mi_11_Ultra.webp'),
    ('Xiaomi Redmi Note 10', 64, 4, 'Gray', 5490000, 'China', 3, '/Images/Xiaomi/Xiaomi_Redmi_Note_10.webp'),
    ('Xiaomi Redmi Note 10 Pro', 128, 6, 'Gold', 6090000, 'China', 3, '/Images/Xiaomi/Xiaomi_Redmi_Note_10_Pro.webp'),
    ('Xiaomi Redmi Note 10S', 128, 6, 'Blue', 4690000, 'China', 3, '/Images/Xiaomi/Xiaomi_Redmi_Note_10S.webp'),
    ('Xiaomi 12', 128, 8, 'Green', 12590000, 'China', 3, '/Images/Xiaomi/Xiaomi_12.webp'),
    ('Xiaomi 12 Pro', 256, 12, 'Blue', 14290000, 'China', 3, '/Images/Xiaomi/Xiaomi_12_Pro.webp'),
    ('Xiaomi 12X', 128, 8, 'Black', 10950000, 'China', 3, '/Images/Xiaomi/Xiaomi_12X.webp'),
    ('Xiaomi 12 Lite', 128, 6, 'Pink', 11700000, 'China', 3, '/Images/Xiaomi/Xiaomi_12_Lite.webp'),
    ('Xiaomi Mi 9', 128, 6, 'Purple', 5200000, 'China', 3, '/Images/Xiaomi/Xiaomi_Mi_9.webp'),
    ('Xiaomi Poco X3', 64, 6, 'Cobalt Blue', 5600000, 'China', 3, '/Images/Xiaomi/Xiaomi_Poco_X3.webp'),
    ('Xiaomi Poco F2 Pro', 256, 8, 'Phantom Black', 12490000, 'China', 3, '/Images/Xiaomi/Xiaomi_Poco_F2_Pro.webp'),
    ('Xiaomi Poco X3 NFC', 64, 6, 'Shadow Gray', 5600000, 'China', 3, '/Images/Xiaomi/Xiaomi_Poco_X3_NFC.webp'),
    ('Xiaomi Redmi Note 11 Pro', 128, 6, 'White', 299.99, 'China', 3, '/Images/Xiaomi/Xiaomi_Redmi_Note_11_Pro.webp'),
    ('Xiaomi Redmi K40 Pro+', 256, 8, 'Blue', 549.99, '9250000', 3, '/Images/Xiaomi/Xiaomi_Redmi_K40_Pro+.webp');

-- Oppo
INSERT INTO phone (name, capacity, ram, color, price, origin, brand_id, imgurl)
VALUES
    ('Oppo Find X3 Pro', 256, 12, 'Black', 18790000, 'China', 4, '/Images/Oppo/Oppo_Find_X3_Pro.webp'),
    ('Oppo Reno 5', 128, 8, 'Silver', 86900000, 'China', 4, '/Images/Oppo/Oppo_Reno_5.webp'),
    ('Oppo Reno 5 Pro', 256, 8, 'Blue', 7790000, 'China', 4, '/Images/Oppo/Oppo_Reno_5_Pro.jpg'),
    ('Oppo F19 Pro+', 128, 8, 'SLiver', 8200000, 'China', 4, '/Images/Oppo/Oppo_F19_Pro+.webp'),
    ('Oppo Reno 8 Pro 5G', 256, 12, 'Glazed Green', 13990000, 'China', 4, '/Images/Oppo/Oppo_Reno_8_Pro_5G.webp'),
    ('Oppo Reno 8 5G', 128, 8, 'Shimmer Gold', 13990000, 'China', 4, '/Images/Oppo/Oppo_Reno_8_5G.webp'),
    ('Oppo A77 5G', 128, 6, 'Sky Blue', 6800000, 'China', 4, '/Images/Oppo/Oppo_A77_5G.webp'),
    ('Oppo A96 5G', 128, 8, 'Starry Black', 5090000, 'China', 4, '/Images/Oppo/Oppo_A96_5G.webp'),
    ('Oppo F21 Pro', 128, 8, 'Cosmic Yellow', 8100000, 'China', 4, '/Images/Oppo/Oppo_F21_Pro.webp'),
    ('Oppo Find X5 Pro 5G', 256, 12, 'White', 14090000, 'China', 4, '/Images/Oppo/Oppo_Find_X5_Pro_5G.webp'),
    ('Oppo K10 5G', 128, 6, 'Black', 8800000, 'China', 4, '/Images/Oppo/Oppo_K10_5G.jpg'),
    ('Oppo A54 5G', 128, 4, 'Blue', 4260000, 'China', 4, '/Images/Oppo/Oppo_A54_5G.webp'),
    ('Oppo A16s', 64, 4, 'Space Black', 4190000, 'China', 4, '/Images/Oppo/Oppo_A16s.webp'),
    ('Oppo A76', 128, 6, 'Fluid Black', 4190000, 'China', 4, '/Images/Oppo/Oppo_A76.webp');

-- Vivo
INSERT INTO phone (name, capacity, ram, color, price, origin, brand_id, imgurl)
VALUES
    ('Vivo V25 Pro', 256, 12, 'Elegant Blue', 7690000, 'China', 5, '/Images/Vivo/Vivo_V25_Pro.webp'),
    ('Vivo V25', 128, 8, 'Diamond Yellow', 6890000, 'China', 5, '/Images/Vivo/Vivo_V25.webp'),
    ('Vivo V23 5G', 128, 12, 'Sunshine Gold', 12990000, 'China', 5, '/Images/Vivo/Vivo_V23_5G.webp'),
    ('Vivo Y100 5G', 128, 8, 'Green', 299.99, 'China', 5, '/Images/Vivo/Vivo_Y100_5G.webp'),
    ('Vivo X90 Pro 5G', 256, 12, 'Legendary Black', 22600000, 'China', 5, '/Images/Vivo/Vivo_X90_Pro_5G.webp'),
    ('Vivo X90 5G', 128, 8, 'Global Blue', 12990000, 'China', 5, '/Images/Vivo/Vivo_X90_5G.jpg'),
    ('Vivo Y35 5G', 128, 8, 'Sporty Black', 4590000, 'China', 5, '/Images/Vivo/Vivo_Y35_5G.webp'),
    ('Vivo T1 5G', 128, 6, 'Lunar Black', 7990000, 'China', 5, '/Images/Vivo/Vivo_T1_5G.webp'),
    ('Vivo Y76 5G', 128, 8, 'Sliver Space', 249.99, 'China', 5, '/Images/Vivo/Vivo_Y76_5G.webp'),
    ('Vivo Y22 5G', 64, 4, 'Wave Blue', 5290000, 'China', 5, '/Images/Vivo/Vivo_Y22_5G.jpg'),
    ('Vivo V21s', 128, 8, 'Dusk Blue', 4990000, 'China', 5, '/Images/Vivo/Vivo_V21s.webp'),
    ('Vivo Y16', 128, 4, 'Titanium Grey', 3690000, 'China', 5, '/Images/Vivo/Vivo_Y16.webp'),
    ('Vivo V21e 5G', 128, 8, 'Silver', 7300000, 'China', 5, '/Images/Vivo/Vivo_V21e_5G.jpg'),
    ('Vivo T1 Pro 5G', 128, 8, 'Turbo Black', 7100000, 'China', 5, '/Images/Vivo/Vivo_T1_Pro_5G.jpg'),
    ('Vivo Y02', 64, 3, 'Fluorite Blue', 18900000, 'China', 5, '/Images/Vivo/Vivo_Y02.webp');


INSERT INTO user_detail (name, email, phone, address, user_id)
VALUES ('Nguyễn Văn Admin', 'admin@gmail.com', '0123456789', 'Codegym', 1);

INSERT INTO orderr (order_id, created_date, status, total_price, user_id) VALUES
(1, '2025-01-01', 'Pending', 5000000, 1),
(2, '2025-01-02', 'Completed', 12000000, 2),
(3, '2025-01-03', 'Pending', 8500000, 3),
(4, '2025-01-04', 'Shipped', 9500000, 1),
(5, '2025-01-05', 'Completed', 4200000, 4),
(6, '2025-01-06', 'Pending', 11000000, 5),
(7, '2025-01-07', 'Shipped', 6700000, 6),
(8, '2025-01-08', 'Completed', 8900000, 7),
(9, '2025-01-09', 'Pending', 10000000, 8),
(10, '2025-01-10', 'Shipped', 6200000, 9),
(11, '2025-01-11', 'Completed', 5400000, 10),
(12, '2025-01-12', 'Pending', 13200000, 11),
(13, '2025-01-13', 'Shipped', 10300000, 12),
(14, '2025-01-14', 'Completed', 7600000, 13),
(15, '2025-01-15', 'Pending', 9500000, 14),
(16, '2025-01-16', 'Shipped', 8800000, 15),
(17, '2025-01-17', 'Completed', 9800000, 16),
(18, '2025-01-18', 'Pending', 12300000, 17),
(19, '2025-01-19', 'Shipped', 7900000, 18),
(20, '2025-01-20', 'Completed', 10500000, 19);

INSERT INTO cart(cart_id, user_id) VALUES (1,2);
insert INTO cart_item(total_price, price, quantity, cart_id, phone_id)
values (5000000, 5000000, 1, 1, 4);

