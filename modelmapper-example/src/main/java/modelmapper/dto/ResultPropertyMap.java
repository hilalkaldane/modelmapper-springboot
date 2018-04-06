package modelmapper.dto;

import org.modelmapper.PropertyMap;

import modelmapper.model.Result;

public class ResultPropertyMap {

	public static PropertyMap<Result, ResultDto> property_map = new PropertyMap<Result, ResultDto>() {
		@Override
		protected void configure() {
			map().setResult_Id(source.getId());
			map().setStudent_Id(source.getStudent().getId());
			map().setStudent_Name(source.getStudent().getName());
			map().setEnglish(source.getEnglish());
			map().setMaths(source.getMaths());
			map().setScience(source.getScience());
			map().setComputer_Science(source.getComputer_science());
		}
	};
}
