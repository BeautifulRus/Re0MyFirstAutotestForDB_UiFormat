package MyFirstDBWithUI;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public interface ConfigProvider {
    Config config = readConfig();

    static Config readConfig(){
        return ConfigFactory.systemProperties().hasPath("testProfile")
                ? ConfigFactory.load(ConfigFactory.systemProperties().getString("testProfile"))
               : ConfigFactory.load("application_ProductPage.conf");
    }

    // НЕ ПРИДУМАЛ СПОСОБА ПЕРЕБОРА ТЕСТОВЫХ ДАННЫХ, ТАК ЧТО ПРОСТО ПЕРЕБРАЛ ИХ ТУТ((
    // зря сделал интерфейс и файл конфига для этого тест-кейса
    // при моей реализации в голове, этот интерфейс нарушал бы свои правила,
    // что уже делало бы его не интерфейсом(
    // а так, некрасивую ненужную штуку сделал



    String URL = readConfig().getString("url");
    String PRODUCT_NAME1 = readConfig().getString("productList.var1.productName");
    Boolean IS_FRUIT1 = readConfig().getBoolean("productList.var1.isFruit");
    Boolean IS_EXOTIC1 = readConfig().getBoolean("productList.var1.isExotic");


    String PRODUCT_NAME2 = readConfig().getString("productList.var2.productName");
    Boolean IS_FRUIT2 = readConfig().getBoolean("productList.var2.isFruit");
    Boolean IS_EXOTIC2 = readConfig().getBoolean("productList.var2.isExotic");


}
