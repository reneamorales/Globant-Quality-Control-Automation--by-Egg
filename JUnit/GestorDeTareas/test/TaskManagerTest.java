
import Entity.TaskManager;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author renem
 */
public class TaskManagerTest {

    public TaskManagerTest() {
    }

    TaskManager tms;

    @BeforeClass
    public static void setUpClass() {
        
    }

    @AfterClass
    public static void tearDownClass() {
        
    }

    @Before
    public void setUp() {
        tms = new TaskManager();
        tms.addTask("Tarea 1");
    }

    @After
    public void tearDown() {
    }

    @Test
    public void deberiaAgregarTarea() {
        assertEquals(1, tms.getTask().size());
        assertTrue(tms.getTask().contains("Tarea 1"));
    }

    @Test
    public void deberiaRemoverTarea() {
        List<String> submittedTasks = tms.getTask();
        assertEquals(true, submittedTasks.contains("Tarea 1"));
        tms.removeTask("Tarea 1");
        assertEquals(0, tms.getTask().size());
        assertEquals(false, submittedTasks.contains("Tarea 1"));
        
    }

    @Test
    public void deberiaDevolvertTodasLasTareas() {
  
        tms.addTask("Tarea 2");
        tms.addTask("Tarea 3");
        List<String> tareas = tms.getTask();
        assertEquals(3, tareas.size());
        assertTrue(tareas.contains("Tarea 1"));
        assertTrue(tareas.contains("Tarea 2"));
        assertTrue(tareas.contains("Tarea 3"));
        assertFalse(tareas.contains("Tarea 4"));
    }
}
