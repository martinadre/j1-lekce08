package cz.czechitas.lekce8.svatky;

import org.junit.jupiter.api.Test;

import java.time.Month;
import java.time.MonthDay;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class SvatkyTest {
  private final Svatky svatky = new Svatky();

  @Test
  void svatkyVMesici() {
    assertEquals(50, svatky.svatkyVMesici(Month.JANUARY).count());
    assertEquals("Karina", svatky.svatkyVMesici(Month.JANUARY)
            .findFirst()
            .get()
            .getJmeno()
    );
  }

  @Test
  void datumSvatku() {
    assertEquals(
            MonthDay.of(12, 24),
            svatky.datumSvatku("Eva").findFirst().get()
    );
    assertEquals(
            MonthDay.of(3, 19),
            svatky.datumSvatku("Josef").findFirst().get()
    );
    assertIterableEquals(
            Arrays.asList(
                    MonthDay.of(2, 22),
                    MonthDay.of(6, 29)
            ),
            svatky.datumSvatku("Petr")
                    .collect(Collectors.toList())
    );
  }

  @Test
  void muzi() {
    assertEquals(268, svatky.muzi().count());
  }

  @Test
  void zeny() {
    assertEquals(276, svatky.zeny().count());
  }

  @Test
  void den() {
    assertIterableEquals(
            Arrays.asList("Adam", "Eva", "Gaia", "Kračun"),
            svatky.den(MonthDay.of(12, 24))
                    .collect(Collectors.toList())
    );
  }

  @Test
  void zenskaJmenaVMesici() {
    assertIterableEquals(
            Arrays.asList(
                    "Brigid",
                    "Nela",
                    "Jarmila",
                    "Dobromila",
                    "Dobromíra",
                    "Vanda",
                    "Danuše",
                    "Veronika",
                    "Bereniké",
                    "Verona",
                    "Milada",
                    "Mlada",
                    "Apolena",
                    "Apolonie",
                    "Božena",
                    "Slavěna",
                    "Slávka",
                    "Věnceslava",
                    "Věnka",
                    "Valentýna",
                    "Jiřina",
                    "Jorga",
                    "Ljuba",
                    "Miloslava",
                    "Gizela",
                    "Lenka",
                    "Eleonora",
                    "Etel",
                    "Liliana",
                    "Lilie",
                    "Dorota",
                    "Dorothea"
            ),
            svatky.zenskaJmenaVMesici(Month.FEBRUARY)
                    .collect(Collectors.toList())
    );
  }

  @Test
  void pocetMuzuSvatekPrvniho() {
    assertEquals(10, svatky.pocetMuzuSvatekPrvniho());
  }

  @Test
  void vypsatJmenaListopad() {
    svatky.vypsatJmenaListopad();
  }

  @Test
  void pocetUnikatnichJmen() {
    assertEquals(541, svatky.pocetUnikatnichJmen());
  }

  @Test
  void cervenJmenaOdDesatehoJmena() {
    assertIterableEquals(
            Arrays.asList(
                    "Slavoj",
                    "Medard",
                    "Stanislava",
                    "Gita",
                    "Bruno",
                    "Amabel",
                    "Mabel",
                    "Antonie",
                    "Antonín",
                    "Roland",
                    "Vít",
                    "Svantovít",
                    "Isolde",
                    "Zbyněk",
                    "Adolf",
                    "Milan",
                    "Leoš",
                    "Leon",
                    "Květa",
                    "Alois",
                    "Pavla",
                    "Zdeňka",
                    "Zdenka",
                    "Jan",
                    "Ivan",
                    "Adrian",
                    "Ladislav",
                    "Lubomír",
                    "Petr",
                    "Pavel",
                    "Šárka",
                    "Vlastimír"
            ),
            svatky.cervenJmenaOdDesatehoJmena()
                    .collect(Collectors.toList())
    );
  }

  @Test
  void jmenaOdVanoc() {
    assertIterableEquals(
            Arrays.asList(
                    "Adam",
                    "Eva",
                    "Gaia",
                    "Kračun",
                    "Štěpán",
                    "Štefan",
                    "Žaneta",
                    "Bohumila",
                    "Judita",
                    "David",
                    "Silvestr"
            ),
            svatky.jmenaOdVanoc()
                    .collect(Collectors.toList()
                    )
    );
  }

}
