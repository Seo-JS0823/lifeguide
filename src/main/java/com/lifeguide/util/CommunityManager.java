package com.lifeguide.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class CommunityManager {

	private static final String rootPath = "community-board-images";
	
	// 고유한 파일 이름 생성 (확장자 지원) - mimeType ex) "image/jpeg"
	public static String getFileId(String fileName, String mimeType) {
		String uuid = UUID.randomUUID().toString() + "-" + fileName + ".";
		
		String[] typeParse = mimeType.split("/");
		if(!typeParse[0].toLowerCase().equals("image")) return "error";
		
		String type = typeParse[1];
		return uuid + type;
	}
	
	// img 태그 src 속성 value 값 holder 생성
	public static Map<String, String> createHolder(List<String> uuids) {
		int param1Size = uuids.size();
		
		Map<String, String> holderMap = new HashMap<>();
		for(String uuid : uuids) {
			String holder = uuid.substring(0, 8);
			holderMap.put(holder, uuid);
		}
		
		int holderSize = holderMap.size();
		if(param1Size != holderSize) throw new IllegalStateException();
		
		return holderMap;
	}
	
	// 
}
