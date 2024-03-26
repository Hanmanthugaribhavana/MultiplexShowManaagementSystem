package MultiplexDAO;
	import java.util.List;
	import MultiplexEntities.Theatre;



	public interface TheatreDAO {
	   
	    boolean saveTheatre(Theatre theatre);
	    
	    List<Theatre> getAllTheatres();
	    
	    Theatre getTheatreById(int theatreId);
	    
	    boolean updateTheatre(Theatre theatre);
	    
	    boolean deleteTheatre(int theatreId);
	}
