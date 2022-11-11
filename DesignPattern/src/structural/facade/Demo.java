package structural.facade;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Demo {

    public static void main(String[] args) throws Exception {
        ReportGeneratorFacade.generateReport(ReportType.HTML, generateDataSource(), null);
        ReportGeneratorFacade.generateReport(ReportType.TEXT, generateDataSource(), null);
    }

    private static DataSource generateDataSource() {
        Random random = new Random();
        List<DataSource> data = new ArrayList<>();
        data.add(new DataSource(
                "Anna Karenina",
                "",
                "Leo Tolstoi",
                "Die Rache ist mein. Ich will vergelten."));
        data.add(new DataSource(
                "Glück",
                "",
                "Matthieu Richard",
                "Das Glück fällt uns nicht einfach so in den Schoss"));
        data.add(new DataSource(
                "Siddhartha",
                "",
                "Hermann Hesse",
                "Im Schatten des Hauses, in der Sonne des Flussufers" +
                        "bei den Booten, im Schatten des Salwaldes, " +
                        "im Schatten des Feigenbaumes wuchs Siddhartha auf, " +
                        "der schöne Sohn des Brahmanen, der junge Falke, zusammen mit Govinda, " +
                        "seinem Freunde, dem Brahmanensohn"));

        // return a random text
        return data.get(random.nextInt(data.size()));
    }
}
