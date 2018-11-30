Please see the below mapping for inheritance.


    <bean id="contactDetails" class="com.sample.dependencyinjection.ContactDetails">
        <property name="email" value="test@test.com"/>
        <property name="phone" value="1234677"/>

    </bean>

    <bean id="pAddress" class="com.sample.dependencyinjection.PermanentAddress" parent="contactDetails">
        <property name="pCity" value="Zurich"></property>
        <property name="pState" value="swtch"></property>
        <property name="email" value="test@test.com"/>
        <property name="phone" value="1234677"/>
    </bean>

Changed PermanentAddress class by extending Contact Details or directly give the fields if you dont want to extend.
Try to call the bean "pAddress" in your main method. 
	