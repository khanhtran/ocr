# Online Clinic Reservation

## Introduction
We are going to design and implement a online clinic reservation project. This is an engineering proof of concept. It is not a planned marketable project. The goal is to exercise the Spring MVC technology according to the Web Application Architecture (WAA) course guidelines to validate its use in future projects.
## Purpose
	Online Clinic Reservation is a web application which requires patients to register with their username and password before they can access the features. Once a patient has logged in to the account, he can view the doctors’ profile along with their schedules and set up an appointment. The patient can request for an appointment at any time, from their computer or smartphone.
## Requirements 
- Register information for patients, doctors, users and clinical staff
- Create and modify new appointments for existing patients
- View the appointments with assigned doctors with filters by week or month
- Update consultation for each patient when the appointment occurs in the clinic and payment registration or check in and check out

## Common Use-Cases
### Patient register an account

- Patient clicks on Register New Account link
- System shows New Patient Form
- Patient enter first name, last name, date of birth, SSN, user name, password, confirm password, address, city, state and zip code
- Patient clicks on Save Account
- System validates all fields are mandatory, date of birth must be valid, SSN must be the correct format, password must be meet some requirements for security, confirm password must be equals to password, zip code must have two character length.
- System saves information in database and shows confirmation message
 
### Patient make an appointment

- Patient clicks on New Appointment link
- System shows New Appointment Form
- Patient  select a category
- Patient  select a doctor
- Patient enter date for the appointment
- Patient clicks on Check Availability link
- System shows available times spans for the selected doctor in the specified date
- Patient chooses a timespan and click Save Appointment
- System shows a confirmation modal window to accept the sending of data.
- System  validates information and saves appointment to database shows confirmation message.

	
### Admin create new doctor
- Admin click on New Doctor
- System shows New Doctor form
- Admin enter doctor information
- Admin setup available time spans for doctor
- Admin click Save
- System save doctor and schedule information and display confirmation message
	
## Class Diagram

## Sequence Diagrams

### Patient register an account
### Patient make an appointment
### Admin create new doctor



