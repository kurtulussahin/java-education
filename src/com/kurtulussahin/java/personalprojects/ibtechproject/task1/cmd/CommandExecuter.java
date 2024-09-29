package com.kurtulussahin.java.personalprojects.ibtechproject.task1.cmd;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.kurtulussahin.java.personalprojects.ibtechproject.task1.bag.Bag;
import com.kurtulussahin.java.personalprojects.ibtechproject.task1.dao.CommandDao;
import com.kurtulussahin.java.personalprojects.ibtechproject.task1.model.Command;

public class CommandExecuter {
	public static Bag execute(String commandString, Bag bag) throws Exception {
		try {
			CommandDao commandDao = new CommandDao();
			Command command = commandDao.getCommand(commandString);
			if (!isValue(command)) {
				throw new Exception("CommandString not found!");
			}

			Class<?> c = Class.forName("com.kurtulussahin.java.ibtechproject.task1.operation." + command.getClassName());
			printConstructorsData(c);
			Constructor constructor = c.getDeclaredConstructor(); 
			constructor.setAccessible(true); // if constructohr is private, make it public
			Object obj = constructor.newInstance();
			Method method;
			Bag dbBag;
			if (!bag.getMap().isEmpty()) {
				method = c.getDeclaredMethod(command.getMethodName(), Bag.class);
				dbBag = (Bag) method.invoke(obj, bag);

			} else {
				method = c.getDeclaredMethod(command.getMethodName());
				dbBag = (Bag) method.invoke(obj);
			}
			System.out.println("-> Execute method runed");
			return dbBag;

		} catch (Exception e) {
			System.out.println("-> Execute method failed");
			e.printStackTrace();
			throw e;
		}
	}

	private static boolean isValue(Command command) {
		if (command == null) {
			System.out.println("*** NOT FOUND ***");
			return false;
		}
		System.out.println("-> Command Information; \n\t" + command.getCommandName() + "\n\t"
				+ command.getCommandDescription() + "\n\t" + command.getClassName() + "\n\t" + command.getMethodName());
		return true;
	}
	
	private static void printConstructorsData(Class<?> clazz) {
        Constructor<?> [] constructors = clazz.getDeclaredConstructors();

        System.out.println(String.format("class %s has %d declared constructors", clazz.getSimpleName(), constructors.length));

        for (int i = 0 ; i < constructors.length ; i++) {
            Class<?> [] parameterTypes = constructors[i].getParameterTypes();

            List<String> parameterTypeNames = Arrays.stream(parameterTypes)
                    .map( type -> type.getSimpleName())
                    .collect(Collectors.toList());
            
            System.out.println(parameterTypeNames);
            if (parameterTypeNames.isEmpty()) {
            	System.out.println("default constructor- no parameter");
            }

        }
    }

}
