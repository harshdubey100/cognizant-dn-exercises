import com.example.PlacementApi;
import com.example.PlacementService;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class PlacementServiceTest {
    @Test
    public void testStudentPlaced() {
        PlacementApi mockApi = mock(PlacementApi.class);

        when(mockApi.getStudents("2564")).thenReturn("placed");

        PlacementService placementService = new PlacementService(mockApi);

        String result = placementService.checkStatus("2564");

        assertEquals("placed", result);

        verify(mockApi).getStudents("2564");


    }
}
