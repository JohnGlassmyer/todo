package net.johnglassmyer.todo;

import static net.johnglassmyer.todo.Todo.todo;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import net.johnglassmyer.todo.Todo.TodoException;

public class TodoTest {
	@Test
	public void testTodoIgnoringReturn() {
		assertThrows(TodoException.class, () -> { todo(); });
	}

	@Test
	public void testTodoCapturingReturn() {
		assertThrows(TodoException.class, () -> { int[] unused = todo(); synchronized(unused) {} });
	}

	@Test
	public void testWithMessage() {
		String message = "haven't gotten around to it yet";
		assertThrows(TodoException.class, () -> { todo(message); }, message);
	}
}
