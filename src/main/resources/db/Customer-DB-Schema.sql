CREATE SEQUENCE DM_CUSTOMERS_SEQ MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1;
CREATE SEQUENCE DM_CUSTOMER_VALUES_SEQ MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1;
CREATE SEQUENCE DM_ACCOUNTS_SEQ MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1;
CREATE SEQUENCE DM_ACCOUNT_STATUS_LOGS_SEQ MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1;
CREATE SEQUENCE DM_BANK_ACCOUNTS_SEQ MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1;
CREATE SEQUENCE DM_ADDRESSES_SEQ MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1;
CREATE SEQUENCE DM_CONTACTS_SEQ MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1;
CREATE SEQUENCE DM_PROFILES_SEQ MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1;
CREATE SEQUENCE DM_CARD_CONTROL_PROFILES_SEQ MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1;
CREATE SEQUENCE DM_CARD_PRODUCTS_SEQ MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1;
CREATE SEQUENCE DM_CARD_CONTROLS_SEQ MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1;
CREATE SEQUENCE DM_VELOCITY_TYPE_VALUES_SEQ MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1;
CREATE SEQUENCE DM_CARD_REISSUE_PROFILES_SEQ MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1;
CREATE SEQUENCE DM_FEE_PROFILES_SEQ MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1;
CREATE SEQUENCE DM_CARD_FEE_CONTROLS_SEQ MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1;
CREATE SEQUENCE DM_FEE_CONTROLS_SEQ MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1;
CREATE SEQUENCE DM_PRICING_PROFILES_SEQ MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1;
CREATE SEQUENCE DM_PRICING_CONTROLS_SEQ MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1;
CREATE SEQUENCE DM_REBATE_PROFILES_SEQ MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1;
CREATE SEQUENCE DM_REBATES_SEQ MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1;
CREATE SEQUENCE DM_MERCH_AGRMNT_VALUES_SEQ MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1;
CREATE SEQUENCE DM_REBATE_VALUES_SEQ MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1;
CREATE SEQUENCE DM_REBATE_CONTRIBUTIONS_SEQ MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1;
CREATE SEQUENCE DM_HIERARCHIES_SEQ MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1;
CREATE SEQUENCE DM_RELATIONSHIP_ASSIGNMEN_SEQ MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1;
CREATE SEQUENCE DM_REPORT_ASSIGNMENTS_SEQ MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1;
CREATE SEQUENCE DM_APPLICATION_CARD_OFFER_SEQ MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1;
CREATE SEQUENCE DM_CARD_NUMBER_SERIES_SEQ MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1;
CREATE SEQUENCE DM_DIARY_NOTES_SEQ MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1;
CREATE SEQUENCE DM_TAX_NUMBERS_SEQ MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1;
CREATE SEQUENCE DM_TAX_STATUS_SEQ MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1;
CREATE SEQUENCE DM_DEFAULT_PRICING_PROFIL_SEQ MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1;
CREATE SEQUENCE DM_ENTITY_SPECIFICATIONS_SEQ MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1;
CREATE SEQUENCE DM_ENTITY_CHARACTERISTICS_SEQ MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1;
CREATE SEQUENCE DM_ACC_CONTROL_PROFILES_SEQ MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1;

CREATE TABLE DM_CUSTOMERS
  (
    CUSTOMER_OID NUMBER(9,0) DEFAULT DM_CUSTOMERS_SEQ.NEXTVAL NOT NULL PRIMARY KEY
  , CLIENT_MID   NUMBER(9,0)
  , ADDRESS_OID  NUMBER(9,0)
  , CLIENT_NAME NVARCHAR2(500)
  , COUPON_CODE NVARCHAR2(500)
  , ALERT_THRESHOLD_PERCENTAGE CHAR(1 BYTE)
  , ADMIN_TERRITORY_DES NVARCHAR2(500)
  , APPLICATION_NO NVARCHAR2(500)
  , APPLICATION_TYPE_DES NVARCHAR2(500)
  , CUSTOMER_TYPE NVARCHAR2(500)
  , CUSTOMER_TYPE_EXT_CODE NVARCHAR2(500)
  , RECEIVED_ON DATE
  , BILLING_PLAN NVARCHAR2(500)
  , BILLING_PLAN_EXT_CODE NVARCHAR2(500)
  , BILLING_FREQUENCY_DES NVARCHAR2(500)
  , BILLING_FREQUENCY_EXT_CODE NVARCHAR2(500)
  , CYCLE_FREQUENCY_DES NVARCHAR2(500)
  , BUSINESS_TYPE NVARCHAR2(500)
  , BUSINESS_TYPE_EXT_CODE NVARCHAR2(500)
  , BANK_GUARANTEE_AMOUNT NUMBER(18,4)
  , BUYER_CLASS NVARCHAR2(500)
  , CARD_REQUIRED CHAR(1 BYTE)
  , CONTACT_NAME NVARCHAR2(500)
  , COMPANY_NO NVARCHAR2(500)
  , CONTACT_TITLE NVARCHAR2(500)
  , CREDIT_LIMIT NUMBER(18,4)
  , CREDIT_PLAN_DES NVARCHAR2(500)
  , CURRENCY_CODE NVARCHAR2(500)
  , CURRENT_SUPPLIER NVARCHAR2(500)
  , CUSTOMER_NUMBER NVARCHAR2(500)
  , EMAIL_ADDRESS NVARCHAR2(500)
  , EMBOSSING_NAME NVARCHAR2(500)
  , EXTERNAL_ACCOUNT_ID NVARCHAR2(500)
  , EXTERNAL_ACCOUNT_REF NVARCHAR2(500)
  , EXTERNAL_DELIVERY_REF NVARCHAR2(500)
  , EXTERNAL_DELIVERY_NAME NVARCHAR2(500)
  , EXTERNAL_CUSTOMER_CODE NVARCHAR2(500)
  , FINANCIAL_YEAR_END_MONTH NVARCHAR2(500)
  , GL_CHANNEL_DES NVARCHAR2(500)
  , GL_COST_CENTRE_CODE NVARCHAR2(500)
  , INDUSTRY_DES NVARCHAR2(500)
  , INDUSTRY_CODE NVARCHAR2(500)
  , IS_BANK_OPINION               NUMBER(1,0) DEFAULT 0
  , IS_CARD_SYSTEM_ONLY           NUMBER(1,0) DEFAULT 0
  , IS_CHECK_COMPLETED            NUMBER(1,0) DEFAULT 0
  , IS_DIRECTORS_CHEQUE           NUMBER(1,0) DEFAULT 0
  , IS_DIRECTORS_GUARANTEE        NUMBER(1,0) DEFAULT 0
  , IS_DUNN_BRADSTREET_CHECK      NUMBER(1,0) DEFAULT 0
  , IS_FINANCIAL_REFERENCE        NUMBER(1,0) DEFAULT 0
  , IS_INCORPORATION_CERT         NUMBER(1,0) DEFAULT 0
  , IS_PIN_REQUIRED               NUMBER(1,0) DEFAULT 0
  , IS_PROMOTIONAL_MATERIAL       NUMBER(1,0) DEFAULT 0
  , IS_RISK_ASSESSMENT            NUMBER(1,0) DEFAULT 0
  , IS_SECURITY_HELD              NUMBER(1,0) DEFAULT 0
  , IS_SIGNATURE_REQUIRED         NUMBER(1,0) DEFAULT 0
  , IS_TRADE_REFERENCE            NUMBER(1,0) DEFAULT 0
  , IS_USING_ELECTRONIC_MARKETING NUMBER(1,0) DEFAULT 0
  , IS_USING_ELECTRONIC_REPORTING NUMBER(1,0) DEFAULT 0
  , IS_WEB_ACCESS_REQUIRED        NUMBER(1,0) DEFAULT 0
  , IS_TRUSTEE                    NUMBER(1,0) DEFAULT 0
  , IS_TRUST_DEED_RECEIVED        NUMBER(1,0) DEFAULT 0
  , LANGUAGE_CODE NVARCHAR2(500)
  , LANGUAGE_DESCRIPTION NVARCHAR2(500)
  , MAIL_INDICATIOR_DES NVARCHAR2(500)
  , MARKETING_TERRITORY_DES NVARCHAR2(500)
  , NAME NVARCHAR2(500)
  , PHONE_BUSINESS NVARCHAR2(500)
  , PHONE_FAX NVARCHAR2(500)
  , PHONE_MOBILE_1 NVARCHAR2(500)
  , PHONE_MOBILE_2 NVARCHAR2(500)
  , PUMP_CONTROL_DES NVARCHAR2(500)
  , TRADING_NAME NVARCHAR2(500)
  , TAX_NO NVARCHAR2(500)
  , PARENT_COMPANY NVARCHAR2(500)
  , RISK_GRADE_EXT_CODE NVARCHAR2(500)
  , RISK_GRADE_DESCRIPTION NVARCHAR2(500)
  , BEHAVIOURAL_SCORE NVARCHAR2(500)
  , BUSINESS_COMMENCED_ON DATE
  , SPEED_PASS_INDICATOR NVARCHAR2(500)
  , TERRITORIES_DEPARTMENT NVARCHAR2(500)
  , EXTERNAL_APPLICATION_REF NVARCHAR2(500)
  , SECURITY_INDICATOR NVARCHAR2(500)
  , TOTAL_SECURITY_VALUE          NUMBER(18,4)
  , IS_CLIENT_SECURITY_DEPOSIT    NUMBER(1,0) DEFAULT 0
  , IS_RESET_CLIENT_SECUR_DEPOSIT NUMBER(1,0) DEFAULT 0
  , TRADE_EXPOSURE_LIMIT          NUMBER(18,4)
  , PARENT_COMPANY_NO NVARCHAR2(500)
  , EMBASSY_CODE NVARCHAR2(500)
  , ISO_LANGUAGE_CODE NVARCHAR2(500)
  , ENQUIRY_SOURCE_EXT_CODE NVARCHAR2(500)
  , IS_TAX_EXEMPT        NUMBER(1,0) DEFAULT 0
  , MAX_CARD_EXPIRY_DATE DATE
  , PIN_OPTION_DESCRIPTION NVARCHAR2(500)
  , AP_ACCOUNT_CODE NVARCHAR2(500)
  , CONTRA_ACCOUNT_CODE NVARCHAR2(500)
  , MAIN_BUSINESS NVARCHAR2(500)
  , GENDER NVARCHAR2(500)
  , BIRTH_DATE DATE
  , INTERFACE_USER NVARCHAR2(500)  
  )
;

CREATE TABLE DM_CUSTOMER_VALUES
  (
    CUSTOMER_VALUE_OID NUMBER(9,0) DEFAULT DM_CUSTOMER_VALUES_SEQ.NEXTVAL NOT NULL PRIMARY KEY
  , CUSTOMER_OID       NUMBER(9,0)
  , CUSTOMER_VALUE_NO  NUMBER(9,0)
  , CUSTOMER_VALUE_DES NVARCHAR2(500)
  )
;

CREATE TABLE DM_ACCOUNTS
  (
    ACCOUNT_OID  NUMBER(9,0) DEFAULT DM_ACCOUNTS_SEQ.NEXTVAL NOT NULL PRIMARY KEY
  , CUSTOMER_OID NUMBER(9,0)
  , ACCOUNT_NO NVARCHAR2(500)
  , ACTUAL_BALANCE  NUMBER(18,4)
  , CREDIT_LIMIT    NUMBER(18,4)
  , DEPOSIT_BALANCE NUMBER(18,4)
  , EXTERNAL_ACCOUNT_CODE NVARCHAR2(500)
  , LAST_PAYMENT_MADE_ON DATE
  , LAST_PAYMENT_AMOUNT  NUMBER(18,4)
  , LAST_BILLED_ON       DATE
  , LAST_BILLED_AMOUNT   NUMBER(18,4)
  , OPENED_ON            DATE
  , REINSTATED_ON        DATE
  , RISK_GRADE_EXT_CODE NVARCHAR2(500)
  , RISK_GRADE_DESCRIPTION NVARCHAR2(500)
  , SECURITY_INDICATOR NVARCHAR2(500)
  , TOTAL_SECURITY_VALUE NUMBER(18,4)
  , TRADE_EXPOSURE_LIMIT NUMBER(18,4)
  , CLOSED_ON            DATE
  , TAX_NO NVARCHAR2(500)
  , TEMP_CREDIT_AMOUNT NUMBER(18,4)
  , TEMP_CREDIT_REASON_DES NVARCHAR2(500)
  , TEMP_CREDIT_EXPIRES_ON DATE
  , BEHAVIOURAL_SCORE NVARCHAR2(500)
  , ACCOUNT_STATUS_DESCRIPTION NVARCHAR2(500)
  )
;

CREATE TABLE DM_ACCOUNT_STATUS_LOGS
  (
    ACCOUNT_STATUS_LOG_OID NUMBER(9,0) DEFAULT DM_ACCOUNT_STATUS_LOGS_SEQ.NEXTVAL NOT NULL PRIMARY KEY
  , ACCOUNT_OID            NUMBER(9,0)
  , ACCOUNT_STATUS_CODE NVARCHAR2(500)
  , ACCOUNT_STATUS_DES NVARCHAR2(500)
  , ACCOUNT_SUB_STATUS_DES NVARCHAR2(500)
  , EFFECTIVE_AT DATE
  , EXPIRES_AT   DATE
  )
;

CREATE TABLE DM_BANK_ACCOUNTS
  (
    BANK_ACCOUNT_OID NUMBER(9,0) DEFAULT DM_BANK_ACCOUNTS_SEQ.NEXTVAL NOT NULL PRIMARY KEY
  , CUSTOMER_OID NUMBER(9,0) -- for application level
  , ACCOUNT_OID      NUMBER(9,0) -- for account level
  , BANK_NO NVARCHAR2(500)
  , BANK_NAME NVARCHAR2(500)
  , BANK_BRANCH_NO NVARCHAR2(500)
  , BANK_ACCOUNT_NO NVARCHAR2(500)
  , BANK_ACCOUNT_NAME NVARCHAR2(500)
  , BIC NVARCHAR2(500)
  , SWIFT_CODE NVARCHAR2(500)
  , IBAN NVARCHAR2(500)
  , UMR_NO NVARCHAR2(500)
  , CREATED_ON DATE
  , LETTER_ON  DATE
  )
;

CREATE TABLE DM_ADDRESSES
  (
    ADDRESS_OID NUMBER(9,0) DEFAULT DM_ADDRESSES_SEQ.NEXTVAL NOT NULL PRIMARY KEY
  , STREET_ADDRESS_COUNTRY_CODE NVARCHAR2(500)
  , STREET_ADDRESS_LINE_1 NVARCHAR2(500)
  , STREET_ADDRESS_LINE_2 NVARCHAR2(500)
  , STREET_ADDRESS_LINE_3 NVARCHAR2(500)
  , STREET_ADDRESS_LINE_4 NVARCHAR2(500)
  , STREET_ADDRESS_LINE_5 NVARCHAR2(500)
  , STREET_ADDRESS_STATE_DES NVARCHAR2(500)
  , STREET_ADDRESS_POSTAL_CODE NVARCHAR2(500)
  , STREET_ADDRESS_SUBURB NVARCHAR2(500)
  , POSTAL_ADDRESS_COUNTRY_CODE NVARCHAR2(500)
  , POSTAL_ADDRESS_LINE_1 NVARCHAR2(500)
  , POSTAL_ADDRESS_LINE_2 NVARCHAR2(500)
  , POSTAL_ADDRESS_LINE_3 NVARCHAR2(500)
  , POSTAL_ADDRESS_LINE_4 NVARCHAR2(500)
  , POSTAL_ADDRESS_LINE_5 NVARCHAR2(500)
  , POSTAL_ADDRESS_STATE_DES NVARCHAR2(500)
  , POSTAL_ADDRESS_POSTAL_CODE NVARCHAR2(500)
  , POSTAL_ADDRESS_SUBURB NVARCHAR2(500)
  )
;

CREATE TABLE DM_CONTACTS
  (
    CONTACT_OID  NUMBER(9,0) DEFAULT DM_CONTACTS_SEQ.NEXTVAL NOT NULL PRIMARY KEY
  , CUSTOMER_OID NUMBER(9,0)
  , ADDRESS_OID  NUMBER(9,0)
  , CONTACT_TYPE_DES NVARCHAR2(500)
  , CONTACT_NAME NVARCHAR2(500)
  , CONTACT_TITLE NVARCHAR2(500)
  , EMAIL_ADDRESS NVARCHAR2(500)
  , PHONE_BUSINESS NVARCHAR2(500)
  , PHONE_FAX NVARCHAR2(500)
  , PHONE_MOBILE_1 NVARCHAR2(500)
  , PHONE_MOBILE_2 NVARCHAR2(500)
  , IS_DEFAULT NUMBER(1,0) DEFAULT 0
  , ADDRESSOID NUMBER(9,0)
  , MEMBER_TYPE_DESCRIPTION NVARCHAR2(500)
  , CONTACT_TYPE_EXT_CODE NVARCHAR2(500)
  , GENDER NVARCHAR2(500)
  , BIRTH_DATE DATE
  )
;

CREATE TABLE DM_PROFILES
  (
    PROFILE_OID NUMBER(9,0) DEFAULT DM_PROFILES_SEQ.NEXTVAL NOT NULL PRIMARY KEY
  , DESCRIPTION NVARCHAR2(500)
  , EFFECTIVE_ON DATE
  , EXPIRES_ON   DATE
  , IS_DEFAULT   NUMBER(1,0) DEFAULT 0
  , CLIENT_NAME NVARCHAR2(500)
  , CLIENT_MID NUMBER(9,0)
  , CARD_PROGRAM_DESCRIPTION NVARCHAR2(500)
  , APPLICATION_TYPE_DESCRIPTION NVARCHAR2(500)
  , APPLICATION_NO NVARCHAR2(500)
  , CUSTOMER_NO NVARCHAR2(500)
  , CARD_NO NVARCHAR2(500)
  , MERCHANT_NO NVARCHAR2(500)
  )
;

CREATE TABLE DM_CARD_CONTROL_PROFILES
  (
    CARD_CONTROL_PROFILE_OID NUMBER(9,0) DEFAULT DM_CARD_CONTROL_PROFILES_SEQ.NEXTVAL NOT NULL PRIMARY KEY
  , PROFILE_OID              NUMBER(9,0)
  , CUSTOMER_OID             NUMBER(9,0)
  , CARD_OFFER_DESCRIPTION NVARCHAR2(500)
  , CARD_PRODUCT_OID NUMBER(9,0)
  , CARD_CONTROL_OID NUMBER(9,0)
  )
;

CREATE TABLE DM_CARD_PRODUCTS
  (
    CARD_PRODUCT_OID NUMBER(9,0) DEFAULT DM_CARD_PRODUCTS_SEQ.NEXTVAL NOT NULL PRIMARY KEY
  , CARD_OFFER_DESCRIPTION NVARCHAR2(500)
  , APPLICATION_TYPE_DESCRIPTION NVARCHAR2(500)
  , CARD_TYPE_DESCRIPTION NVARCHAR2(500)
  , CARD_PRODUCT_DESCRIPTION NVARCHAR2(500)
  , PLASTIC_CODE NVARCHAR2(500)
  )
;

CREATE TABLE DM_CARD_CONTROLS
  (
    CARD_CONTROL_OID NUMBER(9,0) DEFAULT DM_CARD_CONTROLS_SEQ.NEXTVAL NOT NULL PRIMARY KEY
  , EXT_VELOCITY_PROFILE_NUMBER NVARCHAR2(500)
  , PRODUCT_RESTRICTION_DES NVARCHAR2(500)
  , PRODUCT_RESTRICTION_CODE NVARCHAR2(500)
  , PRODUCT_RESTRI_CARD_OFFER_DES NVARCHAR2(500)
  , TIME_LIMIT_DES NVARCHAR2(500)
  , TIME_LIMIT_CODE NVARCHAR2(500)
  , LOCATION_RESTRICTION_TYPE NVARCHAR2(500)
  , LOCATION_RESTRICTION_DES NVARCHAR2(500)
  , IS_ERROR_PROD_REST_COLL   NUMBER(1,0) DEFAULT 0
  , IS_ERROR_PROD_REST_AUTH   NUMBER(1,0) DEFAULT 0
  , IS_ERROR_TIME_LIMIT_COLL  NUMBER(1,0) DEFAULT 0
  , IS_ERROR_TIME_LIMIT_AUTH  NUMBER(1,0) DEFAULT 0
  , IS_ERROR_LOC_RESTRIC_COLL NUMBER(1,0) DEFAULT 0
  , IS_ERROR_LOC_RESTRIC_AUTH NUMBER(1,0) DEFAULT 0
  , IS_VEHICLE_ID_REQ         NUMBER(1,0) DEFAULT 0
  , IS_ORDER_NUMBER_REQ       NUMBER(1,0) DEFAULT 0
  , IS_DRIVER_ID_REQ          NUMBER(1,0) DEFAULT 0
  , IS_FLEET_ID_REQ           NUMBER(1,0) DEFAULT 0
  , IS_CUSTOMER_SELECTION_REQ NUMBER(1,0) DEFAULT 0
  , IS_ODO_METER_REQ          NUMBER(1,0) DEFAULT 0
  , IS_ODO_METER_VALIDATION   NUMBER(1,0) DEFAULT 0
  , IS_POS_PIN_CHANGE_ALLOWED NUMBER(1,0) DEFAULT 0
  , EFFECTIVE_ON              DATE
  , EXPIRES_ON                DATE
  )
;

CREATE TABLE DM_VELOCITY_TYPE_VALUES
  (
    VELOCITY_TYPE_VALUE_OID NUMBER(9,0) DEFAULT DM_VELOCITY_TYPE_VALUES_SEQ.NEXTVAL NOT NULL PRIMARY KEY
  , CARD_CONTROL_OID        NUMBER(9,0)
  , TYPE_COLUMN_NAME NVARCHAR2(500)
  , DESCRIPTION NVARCHAR2(500)
  , IS_ERROR_TYPE_AUTH    NUMBER(1,0) DEFAULT 0
  , IS_ERROR_TYPE_COLLECT NUMBER(1,0) DEFAULT 0
  )
;

CREATE TABLE DM_CARD_REISSUE_PROFILES
  (
    CARD_REISSUE_PROFILE_OID   NUMBER(9,0) DEFAULT DM_CARD_REISSUE_PROFILES_SEQ.NEXTVAL NOT NULL PRIMARY KEY
  , PROFILE_OID                NUMBER(9,0)
  , CUSTOMER_OID               NUMBER(9,0)
  , CARD_REISSUE_CONFIRM_MONTH NUMBER(9,0)
  , CARD_REISSUE_ON_DAYS       NUMBER(9,0)
  , CARD_REISSUE_ACTIVE_DAYS   NUMBER(9,0)
  , CARD_REISSUE_OVERRIDE_EXCLU NVARCHAR2(500)
  , IS_AUTO_REISSUE NUMBER (1,0) DEFAULT 0
  )
;

CREATE TABLE DM_FEE_PROFILES
  (
    FEE_PROFILE_OID      NUMBER(9,0) DEFAULT DM_FEE_PROFILES_SEQ.NEXTVAL NOT NULL PRIMARY KEY
  , PROFILE_OID          NUMBER(9,0)
  , CUSTOMER_OID         NUMBER(9,0)
  , CARD_FEE_CONTROL_OID NUMBER(9,0)
  , CARD_PRODUCT_OID     NUMBER(9,0)
  , CARD_OFFER_DESCRIPTION NVARCHAR2(500)
  , CARD_TYPE_DESCRIPTION NVARCHAR2(500)
  , FEE_TYPE_DESCRIPTION NVARCHAR2(500)
  )
;

CREATE TABLE DM_CARD_FEE_CONTROLS
  (
    CARD_FEE_CONTROL_OID    NUMBER(9,0) DEFAULT DM_CARD_FEE_CONTROLS_SEQ.NEXTVAL NOT NULL PRIMARY KEY
  , CARD_ISSUE_FEE_OID      NUMBER(9,0)
  , PERIODIC_CARD_FEE_1_OID NUMBER(9,0)
  , PERIODIC_CARD_FEE_2_OID NUMBER(9,0)
  , PERIODIC_CARD_FEE_3_OID NUMBER(9,0)
  )
;

CREATE TABLE DM_FEE_CONTROLS
  (
    FEE_CONTROL_OID NUMBER(9,0) DEFAULT DM_FEE_CONTROLS_SEQ.NEXTVAL NOT NULL PRIMARY KEY
  , FEE_DESCRIPTION NVARCHAR2(500)
  , MSF_DESCRIPTION NVARCHAR2(500)
  , INITIAL_DELAY_MONTHS NUMBER(9,0)
  , IS_FEE_CHARGED       NUMBER(1,0) DEFAULT 0
  , APPLY_MONTHS         NUMBER(9,0)
  )
;

CREATE TABLE DM_PRICING_PROFILES
  (
    PRICING_PROFILE_OID NUMBER(9,0) DEFAULT DM_PRICING_PROFILES_SEQ.NEXTVAL NOT NULL PRIMARY KEY
  , PROFILE_OID         NUMBER(9,0)
  , CUSTOMER_OID        NUMBER(9,0)
  )
;

CREATE TABLE DM_PRICING_CONTROLS
  (
    PRICING_CONTROL_OID NUMBER(9,0) DEFAULT DM_PRICING_CONTROLS_SEQ.NEXTVAL NOT NULL PRIMARY KEY
  , PRICING_PROFILE_OID NUMBER(9,0)
  , PRODUCT_ID          NUMBER(9,0)
  , PRODUCT_DES NVARCHAR2(500)
  , PRICING_SCHEME_ID NUMBER(9,0)
  , PRICING_SCHEME_DES NVARCHAR2(500)
  )
;

CREATE TABLE DM_REBATE_PROFILES
  (
    REBATE_PROFILE_OID NUMBER(9,0) DEFAULT DM_REBATE_PROFILES_SEQ.NEXTVAL NOT NULL PRIMARY KEY
  , PROFILE_OID        NUMBER(9,0)
  , CUSTOMER_OID       NUMBER(9,0)
  , REBATE_USER NVARCHAR2(500)
  )
;

CREATE TABLE DM_REBATES
  (
    REBATE_OID             NUMBER(9,0) DEFAULT DM_REBATES_SEQ.NEXTVAL NOT NULL PRIMARY KEY
  , REBATE_PROFILE_OID     NUMBER(9,0)
  , MERCH_AGRMNT_VALUE_OID NUMBER(9,0)
  , DESCRIPTION NVARCHAR2(500)
  , REBATE_CATEGORY_DES NVARCHAR2(500)
  , EFFECTIVE_ON DATE
  , EXPIRES_ON   DATE
  , PRODUCT_NAME NVARCHAR2(500)
  , PRODUCT_GROUP_NAME NVARCHAR2(500)
  , PRODUCT_GROUP_TYPE_DES NVARCHAR2(500)
  , EXTERNAL_CLIENT_CODE NVARCHAR2(500)
  , THIRD_PARTY_CUSTOMER_NO NVARCHAR2(500)
  , MEMBER_TYPE_DESCRIPTION NVARCHAR2(500)
  , MEMBER_NO NVARCHAR2(500)
  , CURRENT_CLIENT_MID NUMBER(9,0) NOT NULL
  , CURRENT_CLIENT_NAME NVARCHAR2(500)
  , CURRENT_CARD_PROGRAM_DES NVARCHAR2(500)
  )
;

CREATE TABLE DM_MERCH_AGRMNT_VALUES
  (
    MERCH_AGRMNT_VALUE_OID NUMBER(9,0) DEFAULT DM_MERCH_AGRMNT_VALUES_SEQ.NEXTVAL NOT NULL PRIMARY KEY
  , DESCRIPTION NVARCHAR2(500)
  , EXTERNAL_CODE NVARCHAR2(500)
  , MERCH_AGRMNT_VALUE_TYPE_DES NVARCHAR2(500)
  , MERCH_AGRMNT_VALUE_NO NVARCHAR2(500)
  )
;

CREATE TABLE DM_REBATE_VALUES
  (
    REBATE_VALUE_OID NUMBER(9,0) DEFAULT DM_REBATE_VALUES_SEQ.NEXTVAL NOT NULL PRIMARY KEY
  , REBATE_OID       NUMBER(9,0)
  , RATE             NUMBER(18,4)
  , VALUE_RANGE_FROM NUMBER(18,4)
  , VALUE_RANGE_TO   NUMBER(18,4)
  )
;

CREATE TABLE DM_REBATE_CONTRIBUTIONS
  (
    REBATE_CONTRIBUTION_OID NUMBER(9,0) DEFAULT DM_REBATE_CONTRIBUTIONS_SEQ.NEXTVAL NOT NULL PRIMARY KEY
  , REBATE_OID              NUMBER(9,0)
  , MEMBER_TYPE_DESCRIPTION NVARCHAR2(500)
  , MEMBER_NO NVARCHAR2(500)
  , PERCENTAGE NUMBER(18,4)
  )
;

CREATE TABLE DM_HIERARCHIES
  (
    HIERARCHY_OID NUMBER(9,0) DEFAULT DM_HIERARCHIES_SEQ.NEXTVAL NOT NULL PRIMARY KEY
  , CUSTOMER_OID  NUMBER(9,0)
  , DESCRIPTION NVARCHAR2(500)
  , IS_MERCH_AGREEEMNT_REPORT NUMBER(1,0) DEFAULT 0
  , IS_LOCATION               NUMBER(1,0) DEFAULT 0
  , IS_CUSTOMER_REPORT        NUMBER(1,0) DEFAULT 0
  , IS_CUSTOMER_FINANCIAL     NUMBER(1,0) DEFAULT 0
  , IS_FUND_TRANSFER          NUMBER(1,0) DEFAULT 0
  , IS_CUSTOMER_CREDIT_LIMIT  NUMBER(1,0) DEFAULT 0
  , IS_PERIOD_REBATE          NUMBER(1,0) DEFAULT 0
  , PARENT_SEARCH_NUMBER NVARCHAR2(500)
  , IS_ENFORCE_CREATION           NUMBER(1,0) DEFAULT 0
  , IS_ENFORCE_FINAN_HIE_CREATION NUMBER(1,0) DEFAULT 0
  )
;

CREATE TABLE DM_RELATIONSHIP_ASSIGNMENTS
  (
    RELATIONSHIP_ASSIGNMENT_OID NUMBER(9,0) DEFAULT DM_RELATIONSHIP_ASSIGNMEN_SEQ.NEXTVAL NOT NULL PRIMARY KEY
  , HIERARCHY_OID               NUMBER(9,0)
  , EFFECTIVE_ON                DATE
  , EXPIRES_ON                  DATE
  , IS_BILLING_ENTITY           NUMBER(1,0) DEFAULT 0
  , IS_BALANCE_ENTITY           NUMBER(1,0) DEFAULT 0
  , IS_AUTHORISATION_ENTITY     NUMBER(1,0) DEFAULT 0
  , IS_PAYER_ENTITY             NUMBER(1,0) DEFAULT 0
  )
;

CREATE TABLE DM_REPORT_ASSIGNMENTS
  (
    REPORT_ASSIGNMENT_OID NUMBER(9,0) DEFAULT DM_REPORT_ASSIGNMENTS_SEQ.NEXTVAL NOT NULL PRIMARY KEY
  , HIERARCHY_OID         NUMBER(9,0)
  , CUSTOMER_OID          NUMBER(9,0)
  , REPORT_TYPE_DESCRIPTION NVARCHAR2(500)
  , FREQUENCY_DESCRIPTION NVARCHAR2(500)
  , DELIVERY_TYPE_DESCRIPTION NVARCHAR2(500)
  , CREATED_ON               DATE
  , LAST_REPORTED_ON         DATE
  , PREVIOUS_REPORTED_ON     DATE
  , IS_PULL_CODE_USED        NUMBER(1,0) DEFAULT 0
  , IS_ENABLED               NUMBER(1,0) DEFAULT 0
  , IS_ADHOC_REPORT          NUMBER(1,0) DEFAULT 0
  , IS_INTERNET_USER         NUMBER(1,0) DEFAULT 0
  , IS_CARD_DETAILS_REQUIRED NUMBER(1,0) DEFAULT 0
  , IS_ATTACHMENT_COMPRESSED NUMBER(1,0) DEFAULT 0
  , CONTACT_HIERARCHY_DESCRIPTION NVARCHAR2(500)
  , DESCRIPTION NVARCHAR2(500)
  , EMAIL_ADDRESS NVARCHAR2(500)
  , MEMBER_TYPE_DESCRIPTION NVARCHAR2(500)
  , FEE_DESCRIPTION NVARCHAR2(500)
  , SORT_OPTION_DESCRIPTION NVARCHAR2(500)
  )
;

CREATE TABLE DM_APPLICATION_CARD_OFFERS
  (
    APPLICATION_CARD_OFFER_OID NUMBER(9,0) DEFAULT DM_APPLICATION_CARD_OFFER_SEQ.NEXTVAL NOT NULL PRIMARY KEY
  , CUSTOMER_OID               NUMBER(9,0)
  , CARD_PRODUCT_OID           NUMBER(9,0)
  , CARD_OFFER_DESCRIPTION NVARCHAR2(500)
  , INIT_CARD_STATUS_DESCRIPTION NVARCHAR2(500)
  , IS_INIT_CARD_STATUS_OVERRIDE NUMBER(1,0) DEFAULT 0
  , IS_CARD_REQ_VALIDATION_RULE  NUMBER(1,0) DEFAULT 0
  , EXT_EMBOSSER_CUSTOMER_REF NVARCHAR2(500)
  )
;

CREATE TABLE DM_CARD_NUMBER_SERIES
  (
    CARD_NUMBER_SERIES_OID NUMBER(9,0) DEFAULT DM_CARD_NUMBER_SERIES_SEQ.NEXTVAL NOT NULL PRIMARY KEY
  , CUSTOMER_OID           NUMBER(9,0) NOT NULL
  , SERIES_NUMBER          NUMBER(9,0) NOT NULL
  , SEQUENCE_NUMBER        NUMBER(9,0) NOT NULL
  )
;

CREATE TABLE DM_DIARY_NOTES
  (
    DIARY_NOTE_OID NUMBER(9,0) DEFAULT DM_DIARY_NOTES_SEQ.NEXTVAL NOT NULL PRIMARY KEY
  , CUSTOMER_OID   NUMBER(9,0)
  , SHORT_NOTE NVARCHAR2(500)
  , DETAILED_NOTE NVARCHAR2(500)
  , BRING_UP_AT           DATE
  , IS_HIGH_PRIORITY      NUMBER(1,0) DEFAULT 0
  , WORK_QUEUE_CLIENT_MID NUMBER(9,0) NOT NULL
  , WORK_QUEUE_EXTERNAL_CODE NVARCHAR2(500)
  , WORK_QUEUE_DESCRIPTION NVARCHAR2(500)
  )
;

CREATE TABLE DM_TAX_NUMBERS
  (
    TAX_NUMBER_OID NUMBER(9,0) DEFAULT DM_TAX_NUMBERS_SEQ.NEXTVAL NOT NULL PRIMARY KEY
  , CONTACT_OID    NUMBER(9,0)
  , CUSTOMER_OID   NUMBER(9,0)
  , COUNTRY_CODE NVARCHAR2(500)
  , TAX_NO NVARCHAR2(500)
  , MEMBER_NO NVARCHAR2(500)
  , MEMBER_TYPE_DESCRIPTION NVARCHAR2(500)
  , EFFECTIVE_ON DATE
  , EXPIRES_ON   DATE
  , TAX_TYPE_DESCRIPTION NVARCHAR2(500)
  , TAX_NO_REG_TYPE_DESCRIPTION NVARCHAR2(500)
  , IS_RECOVERY_BY_AGENCY NUMBER(1,0) DEFAULT 0
  )
;

CREATE TABLE DM_TAX_STATUS
  (
    TAX_STATUS_OID NUMBER(9,0) DEFAULT DM_TAX_STATUS_SEQ.NEXTVAL NOT NULL PRIMARY KEY
  , CUSTOMER_OID   NUMBER(9,0)
  , TAX_TYPE_DESCRIPTION NVARCHAR2(500)
  , STATUS_DESCRIPTION NVARCHAR2(500)
  , STATUS_EXTERNAL_CODE NVARCHAR2(500)
  , EFFECTIVE_ON DATE
  , EXPIRES_ON   DATE
  )
;

CREATE TABLE DM_DEFAULT_PRICING_PROFILES
  (
    DEFAULT_PRICING_PROFILE_OID NUMBER(9,0) DEFAULT DM_DEFAULT_PRICING_PROFIL_SEQ.NEXTVAL NOT NULL PRIMARY KEY
  , PRICING_PROFILE_OID         NUMBER(9,0)
  , CUSTOMER_OID                NUMBER(9,0)
  , CLIENT_NAME NVARCHAR2(500)
  , CLIENT_MID NUMBER(9,0)
  , MERCH_AGREEM_VALUE_NO NVARCHAR2(500)
  , MERCH_AGREEM_VALUE_DES NVARCHAR2(500)
  , MERCH_AGREEM_VALUE_TYPE_DES NVARCHAR2(500)
  , PRODUCT_GROUP_DESCRIPTION NVARCHAR2(500)
  , PRODUCT_GROUP_TYPE_DESCRIPTION NVARCHAR2(500)
  , PRODUCT_GROUP_EXT_CLIENT_CODE NVARCHAR2(500)
  , CARD_PRODUCT_GROUP_DESCRIPTION NVARCHAR2(500)
  , CARD_PRODUCT_GROUP_EXT_CODE NVARCHAR2(500)
  )
;

CREATE TABLE DM_ENTITY_SPECIFICATIONS
  (
    ENTITY_SPECIFICATION_OID NUMBER(9,0) DEFAULT DM_ENTITY_SPECIFICATIONS_SEQ.NEXTVAL NOT NULL PRIMARY KEY
  , CUSTOMER_OID             NUMBER(9,0)
  , NAME NVARCHAR2(500)
  , ENTITY_TYPE NVARCHAR2(500)
  )
;

CREATE TABLE DM_ENTITY_SPEC_CHARACTERISTICS
  (
    ENTITY_SPE_CHARACTERISTIC_OID NUMBER(9,0) DEFAULT DM_ENTITY_CHARACTERISTICS_SEQ.NEXTVAL NOT NULL PRIMARY KEY
  , ENTITY_SPECIFICATION_OID      NUMBER(9,0)
  , CHARACTERISTIC NVARCHAR2(500)
  , CHARACTERISTIC_VALUE NVARCHAR2(500)
  )
;

CREATE TABLE DM_ACCOUNT_CONTROL_PROFILES
  (
    ACCOUNT_CONTROL_PROFILE_OID NUMBER(9,0) DEFAULT DM_ACC_CONTROL_PROFILES_SEQ.NEXTVAL NOT NULL PRIMARY KEY
  , CUSTOMER_OID                NUMBER(9,0)
  , PROFILE_OID                 NUMBER(9,0)
  , CARD_CONTROL_OID            NUMBER(9,0)
  )
;