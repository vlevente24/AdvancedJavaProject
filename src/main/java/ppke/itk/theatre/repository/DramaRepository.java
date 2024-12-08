package ppke.itk.theatre.repository;

import org.springframework.stereotype.Repository;
import ppke.itk.theatre.domain.Actor;
import ppke.itk.theatre.domain.Drama;

import java.util.List;
import java.util.Optional;

@Repository
public class DramaRepository {

    private final List<Drama> dramas = List.of(
            new Drama(1, "Hamlet", "Tragedy", 154, "William Shakespeare's drama about the Prince of Denmark.", "https://en.wikipedia.org/wiki/Hamlet", new Actor()),
            new Drama(2, "A Midsummer Night's Dream", "Comedy", 159, "William Shakespeare's comedy about the adventures of four young Athenian lovers and a group of amateur actors.", "https://en.wikipedia.org/wiki/A_Midsummer_Night%27s_Dream", new Actor(21, "Andy Vajna", "Hungarian", "https://en.wikipedia.org/wiki/Andy_Vajna")),
            new Drama(3, "The Importance of Being Earnest", "Comedy", 95, "Oscar Wilde's comedy about two friends who use the same pseudonym, resulting in a series of hilarious misunderstandings.", "https://en.wikipedia.org/wiki/The_Importance_of_Being_Earnest", new Actor()),
            new Drama(4, "The Cherry Orchard", "Drama", 104, "Anton Chekhov's drama about an aristocratic Russian family who return to their estate just before it is auctioned to pay the mortgage.", "https://en.wikipedia.org/wiki/The_Cherry_Orchard", new Actor(22, "Arnold Schwarzenegger", "Austrian", "https://en.wikipedia.org/wiki/Arnold_Schwarzenegger")),
            new Drama(5, "The Glass Menagerie", "Drama", 144, "Tennessee Williams' drama about a young", "https://en.wikipedia.org/wiki/The_Glass_Menagerie", null)
    );

    public List<Drama> findAll() {
        return dramas;
    }

    public Optional<Drama> getDrama(Integer id) {
        return dramas.stream().filter(d -> d.getId().equals(id)).findFirst();
    }
}
