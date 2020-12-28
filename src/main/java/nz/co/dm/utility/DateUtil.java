package nz.co.dm.utility;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class DateUtil {
	
	public static XMLGregorianCalendar convertToXMLDate(LocalDateTime localDateTime) throws DatatypeConfigurationException {
		ZonedDateTime zoneDateTime = ZonedDateTime.of(localDateTime, ZoneId.systemDefault());
		GregorianCalendar gregorianCalendar = GregorianCalendar.from(zoneDateTime);
		XMLGregorianCalendar xmlGregorianCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(gregorianCalendar);
		return xmlGregorianCalendar;
	}
	
	public static XMLGregorianCalendar convertToXMLDate(LocalDate localDate) throws DatatypeConfigurationException {
		ZonedDateTime zoneDateTime = ZonedDateTime.of(localDate.atStartOfDay(), ZoneId.systemDefault());
		GregorianCalendar gregorianCalendar = GregorianCalendar.from(zoneDateTime);
		XMLGregorianCalendar xmlGregorianCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(gregorianCalendar);
		return xmlGregorianCalendar;
	}	
}
