# Practice
This repository is created for sample programs that may help in work. 
The project **ObjComp** will demonstrate comparison of two similar type of objects using **Reflection API**.

**Pre-requisite** : Basic Java Knowledge

The **compareObjectFields** of **GenericCompare** class is responssible to compare two objects.

**Usage** : It can be used for audit trail or at the time of Update operation or modification of any object. For example : We want to know which all are the fields modified when we do update operation on database. Let the existing record is kept in oldObject and new record is kept in newObject. Pass these two objects in **compareObjectFields** of **GenericCompare** and it will return you a Map. The **key** of the map will be the property name that is modified and the **value** of the map will be a combination of new value and old value of the property separated by **#**.


