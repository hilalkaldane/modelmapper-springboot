# modelmapper-springboot
Excluding field of Entity from final JSON object without using @JSONIgnore using ModelMapper Library in SpringBoot

## how it works
Suppose you have 2 Entity Objects.
-Student.java
-Result.java

There is one to many relationship between Student and Result.
That is one Student can have Multiple Results.

Contents of Student.java
- Id
- Name
- Email
- Address

Contents of Result.java
- Student
- English
- Maths
- Science
- Computer Science

So when we run Traditional *ResultRepository.findall()*, you will get unnecessary fields of Students such as his *email and Adress*.
```
{
	"result": {
		"id": 1,
		"student": [
			{
				"student_Name": "Hilal Kaldane",
				"student_Email": "hilalkaldane@gmail.com",
				"student_Adress": "India"
			}
		],
		"english": 83,
		"science": 12,
		"maths": 59,
		"computer_Science": 45
	}
}
```
We dont need that in Report Card.

One Option is we can have _@JSONIgnore()_ on *email and Adress* . But we cannot get *email and address* ever using _StudentRepository.findAll();_ 

That is why *ModelMapper* is used.
> *ModelMapper* lets us create seperate logical Model for our Entity that is needed to be Serialized.
> We can have Multiple Models for Single Entity Object.

After we apply ModelMapper, our output becomes.
```
{
	"result": {
		"id": 1,
		"student_Name": "Hilal Kaldane",
		"english": 83,
		"science": 12,
		"maths": 59,
		"computer_Science": 45
	}
}
```
### Additional Info
* Jdk version used : 1.8
* IDE : Eclipse
* Springboot Parent Version : 2.1.0.RELEASE

### Author
* *Hilal Kaldane*
* _hilalkaldane.kaldane937@gmail.com_
