Strategy design pattern is a behavioral software design pattern that enables selecting an algorithm at runtime.
Instead of implementing a single algorithm directly, code receives run-time instructions as to which in a family of algorithms to use.
It also helps to avoid code duplication.

Here in this example Vehicle is parent class having drive method and Car, Bus and Bike are child classed. 
All three classes are overriding drive method. Bike is driving at slow speed. Bus and Car are driving at moderate speed. 
So we are writing same code is Bus and Car class so code duplication is there. To avoid this we can create 1 interface- 
vehicleInterface and this interface has 2 child classes - 1 is for slow driving and 1 is for moderate driving. So in case 
of Bike we can call drive method of slow driving class and in case of Car and Bus , we can call drive method of moderate driving. 
So code duplication is avoided and at runtime we decided which drive to call from main. So in future if requirement changes like 
we need to have bike to drive at moderate speed so from main only we can call moderate drive class and no need to do any code changes 
in Bike class. Also interface - vehicleInterface is scalable, we can easily add various drive options there.
