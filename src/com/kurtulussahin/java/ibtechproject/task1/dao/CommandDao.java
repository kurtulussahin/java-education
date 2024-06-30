package com.kurtulussahin.java.ibtechproject.task1.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.kurtulussahin.java.ibtechproject.task1.cmd.CommandExecuter;
import com.kurtulussahin.java.ibtechproject.task1.model.Command;
import com.kurtulussahin.java.ibtechproject.task1.util.HibernateUtil;

public class CommandDao {

	public Command getCommand(String commandName) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			try {
				transaction = session.beginTransaction();
				transaction.commit();
				List<Command> commands = session.createQuery("FROM Command").list();

				for (Command commandItem : commands) {
					if (commandItem.getCommandName().equals(commandName)) {
						return commandItem;
					}
				}

			} finally {
				session.close();
			}
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		return null;
	}
}
