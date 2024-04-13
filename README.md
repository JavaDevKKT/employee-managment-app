Hello everyone in this app i am using mysql for crud opration perform.
In this app i am using constructor injection EmployeeRestController(){}.

public EmployeeRestController(EmployeeService eService) {
		super();
		this.eService = eService;
	}


Save or Insert record into db.

![Save Emp](https://github.com/JavaDevKKT/employee-managment-app/assets/147974177/6ff722ed-14df-4391-8323-151624f48630)

Get All record from db 

![Emp List](https://github.com/JavaDevKKT/employee-managment-app/assets/147974177/92da097b-5cae-4ed6-b107-8274acb9b91d)

Get Single Employee record from db 

![GetSingleEmployeeRecord](https://github.com/JavaDevKKT/employee-managment-app/assets/147974177/bccb7bce-3317-44c2-bfdc-e06aa0ac7b43)

Update employee Detils

![UpdateEmployee](https://github.com/JavaDevKKT/employee-managment-app/assets/147974177/9f1686ae-3cd1-4e6f-a16e-b72180ac2598)

Delete employee Record from db.

![DeleteEmp](https://github.com/JavaDevKKT/employee-managment-app/assets/147974177/ceb63696-1fea-4d12-837e-05a554380d53)


When employee try to reinsert same record it will don't allow to insert record into db.

![Already Exist](https://github.com/JavaDevKKT/employee-managment-app/assets/147974177/dfd55b52-dff6-47a8-a16b-5933e3479927)

Handle the Globle Exception When User try to get record from db that record not exist.

![EmployeeNotFoundException](https://github.com/JavaDevKKT/employee-managment-app/assets/147974177/4422382c-6f59-40aa-ab77-2f593552a64b)

DB for this app 

![DB](https://github.com/JavaDevKKT/employee-managment-app/assets/147974177/9735ccff-5cda-4782-9d51-4f919c5c3fdf)



