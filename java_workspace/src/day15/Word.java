package day15;

import java.util.Objects;

public class Word implements Comparable{
	/*
	 * 단어장 프로그램 만들기
	 * Word class : 단어, 의미를 저장하는 클래스
	 * ex) apple : 사과
	 * 멤버변수 : word, mean
	 * 
	 * 
	 * 1. 단어추가
	 * 2. 단어출력 (추가된 모든 단어를 정렬해서 출력(word를 기준으로)
	 * 3. 단어검색
	 * 4. 단어수정
	 * 5. 단어삭제
	 * 6. 종료
	 */
	
	private String word;
	private String mean;
	
	
	public Word() {}
	public Word(String word, String mean) {
		this.word = word;
		this.mean = mean;
	}
	
	
	
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public String getMean() {
		return mean;
	}
	public void setMean(String mean) {
		this.mean = mean;
	}
	
	
	@Override
	public String toString() {
		return word + " : " + mean;
	}
	
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(mean, word);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Word other = (Word) obj;
		if(word == null) {
			if(other.word != null) {
				return false;
			}
		} else if(!word.equals(other.word)) {
			return false;
		}
		return true;
	}
	
	@Override
	public int compareTo(Object o) {
		Word word = (Word)o;
		// 오름차순
		return this.word.compareTo(word.word);
		// 내림차순
		// return -this.word.compareTo(word.word);
		
	}
	
	
	
	
}
