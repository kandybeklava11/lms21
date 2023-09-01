import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class LibreryService {
    Scanner scanner=new Scanner(System.in);
    List<Librery>libreries=new ArrayList<>();
    public List<Librery> saveLibrary(List<Librery>libraries){
        this.libreries.addAll(libraries);
        return libraries;
    }

    public List<Librery>getAllLibraries(){
return libreries;
    }

    public Librery getLibraryById(Long id){
        for (Librery labrer:libreries) {
            if(labrer.getId()!=id){
                System.out.println("Not Found");
            }else{
                return labrer;
            }
        }
return null;
    }

    public Librery updateLibrary(Long id, Librery library){
        for (int i = 0; i < libreries.size(); i++) {
            Librery librery = libreries.get(i);
            if (librery.getId() != id) {
                System.out.println("Not correct");
            } else {
                libreries.set(i, library);
                return library;
            }

        }
return null;
    }

    public String deleteLibrary(Long id){
        for (Iterator<Librery> iterator = libreries.iterator(); iterator.hasNext();) {
            Librery library = iterator.next();
            if (library.getId()!=id) {
                System.out.println("Library not found");
            }else{
                iterator.remove();
                return "Library deleted";
            }

        }

return null;
    }
}
