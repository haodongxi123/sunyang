# Administrator
| 字段  | 类型  | 约束  |  说明 |
|---|---|---|---|
| administrator_id  | int  | 主键 自增 | Id  |
| username | varchar(20)  | 非空，唯一索引 | 用户名  |
| real_name  | varchar(20)  | 索引 | 真实姓名  |
| email  | varchar(100)  | 唯一索引 | 邮箱  |
| encrypted_password  | varchar(100)  | 非空 | 加密密码  |
| status  | tinyint  | 非空，默认启用  | 状态（0禁用，1启用）  |
| create_time  | datetime  |  非空 | 创建时间  |
| avatar_url  | varchar(100)  |   | 头像地址 |


# address
| 字段  | 类型  | 约束  |  说明 |
|---|---|---|---|
| address_id  | int  | 主键 自增 | Id  |
| customer_id | int  | 非空，索引,主键 | 客户id  |
| receiver_name  | varchar(20)  | 非空 | 收货人  |
| receiver_mobile  | varchar(100)  | 索引 | 收货人手机  |
| content  | varchar(200)  | 非空 | 地址内容  |
| tag  | varchar(20)  | 非空  | 地址内容  |


# Customer
| 字段  | 类型  | 约束  |  说明 |
|---|---|---|---|
| customer_id  | int  | 主键,非空 | Id  |
| username | varchar(30)  | 非空 | 用户名  |
| real_name  | varchar(20)  | 非空 | 真实姓名  |
| avatar_url  | varchar(200)  |  | 头像  |
| encrypted_password  | varchar(100)  | 非空 | 加密密码  |
| mobile  | varchar(20)  | 唯一索引  | 邮箱  |
| mobile_verified  | bit  |  默认false | 验证手机  |
| email  | varchar(100)  |  唯一索引 | 邮箱 |
| email_verified  | bit  |  默认false | 验证邮箱 |
| status  | tinyint  |  非空 | 创建时间 |
| create_time  | datetime  |  非空 | (0禁用、1启用、2不安全) |
| news_subscribed  | bit  |  非空,索引false | 创建时间 |
| reword_points  | int  |  非空,默认0| 积分 |
| default_address_id  | int  |  外键 | 默认地址 |


## product

| 字段             |     类型     |         约束 |                      说明 |
| ---------------- | :----------: | -----------: | ------------------------: |
| product_id       |     int      |     主键自增 |                    商品id |
| product_code     |     int      | 非空唯一索引 |                  商品编号 |
| product_name     | varchar(50)  |     非空索引 |                  商品名称 |
| price            |    float     |     非空索引 |                      价格 |
| product_abstract | varchar(255) |         非空 |                      摘要 |
| discount         |    float     |              | 打折0.1代表一折0.2代表2折 |
| sort_order       | varchar(255) |         非空 |                      排序 |
| stock_quantity   |     int      |         非空 |                    库存量 |
| status           |     int      |         非空 |        状态0已售完1有存量 |
| main_pic_url     | varchar(255) |              |                主图的地址 |





# ProductDetails
| 字段  | 类型  | 约束  |  说明 |
|---|---|---|---|
| product_id  | int  | 外建 | Id  |
| description | text  | 非空 | 描述  |
| other_pic_urls  | varchar(2000)  | 非空 | 图片(数组)  |


# Oder
| 字段  | 类型  | 约束  |  说明 |
|---|---|---|---|
| oder_id  | bigint  | 主键 自增 | Id  |
| customer_id | int  | 非空，索引,注解 | 客户id  |
| status  | tinyint  | 非空 | 订单状态(0待处理,1处理中,2代发货,3已发货,4代签收,5已签收,6待支付,7已支付,8取消,9拒绝,10完成)  |
| total_price  | double  | 非空 | 总价  |
| reword_points  | int  |  | 积分  |
| create_time  | datetime  | 非空 | 创建时间  |
| create_time  | datetime  |  非空 | 创建时间  |
| update_time  | datetime |   | 更新时间 |


# OderDetails

| 字段  | 类型  | 约束  |  说明 |
| -------- | -------- | ---- | --------- |
| oder_id            | bigint       | 外键 | Id             |
| pay_method         | smallint     | 非空 | 支付方式       |
| invoice_address    | varchar(300) |      | 发票地址       |
| invoice_price      | double       | 非空 | 发票价格       |
| ship_method        | smallint     | 非空 | 寄送方式       |
| ship_address       | varchar(300) | 非空 | 寄送地址       |
| ship_price         | double       |      | 寄送费用       |
| comment            | varchar(300) |      | 备注           |
| content            | text         | 非空 | 内容(对象数组) |
| product_id         | int          | 非空 | Id             |
| product_code       | string       | 非空 | 商品代码       |
| product_name       | string       | 非空 | 商品名称       |
| quantity           | int          | 非空 | 商品数量       |
| unit_price         | double       | 非空 | 单价           |
| unit_reword_points | int          |      | 单个积分       |


# OderHistory
| 字段  | 类型  | 约束  |  说明 |
|---|---|---|---|
| oder_history  | bigint  | 主键 自增 | Id  |
| order_id | int  | 外键,非空,索引 | 订单Id  |
| time  | date  | 非空 | 时间  |
| oder_status  | tinyint  | 非空 | 订单状态  |
| comment  | varchar(300)  |  | 备注  |
| customer_notified  | bit  | 非空  | 是否通知客户  |


# ReturnHistory
| 字段  | 类型  | 约束  |  说明 |
|---|---|---|---|
| return_history_id  | int  | 主键 自增 | Id  |
| return_id | int  | 外建,非空,索引 | 退货Id  |
| time  | datatime  | 非空 | 时间  |
| return_status  | tinyint  | 非空 | 退货状态  |
| comment  | varchar(300)  |  | 备注  |
| customer_notified  | bit  |  非空 | 是否通知客户  |

# Return

| 字段  | 类型  | 约束  |  说明 |
| -------- | -------- | ---- | --------- |
| return_id            | int       | 主键,自增 | Id             |
| oder_id         | int     | 外建,非空,索引 | 订单id       |
| oder_time    | datetime |      |        |  订单时间
| customer_id     | datetime       | 非空 | 下单客户id       |
| customer_name        | varchar(20)     | 非空 | 退货人       |
| mobile       | varchar(20) | 非空 | 手机       |
| email         | varchar(100)      |   非空   | 邮箱       |
| status            | tinyint |      | 非空           |状态(0等待取货,1正在处理,2完成)
| return_action            | tinyint         | 非空 |处理方式(0等待取货,1换货,2修理) |
| product_code         | varchar(50)   | 非空 | 商品代码           |
| product_name    | varchar(100)       | 非空 | 商品名称      |
| quantity       | int       | 非空 | 商品数量     |
| reason           | tinyint          | 非空 | 退货原因      |
| comment         | varchar(300)      | | 备注          |
| create_time | datatime      |   非空,索引   | 创建时间       |
| update_time | datatime      |   非空   | 修改时间       |





