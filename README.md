# distributedPassbook
## About the Project
- This is a backend system of a passbook application for coupon distribution, management, and usage
- There are two subsystems:
  - Merchant System allows authenticated merchants to register and publish coupons
  - User System allows registered users to get, manage, use, and review coupons
- Two database are used:
  - MySQL for merchant information
  - HBase for user and coupon information
- The two subsystems are communicated through Kafka, which delivers coupons from merchants to users
- The system also use Redis to store frequently used coupons to ensure the operating speed
- This is only a backend system, and the reserved web API will be tested uisng Postman

## Tech
Java | SpringBoot | MySQL | HBase | Redis | Kafka | Maven | Postman

## Project Architecture
![Project Architecture](https://drive.google.com/uc?export=view&id=1B3lw5Cx7fHlkykosRdjlp6SU5PleT4yf)
