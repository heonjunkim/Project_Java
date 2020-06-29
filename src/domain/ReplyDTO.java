package domain;

public class ReplyDTO {
	//1. 변수
	
	private String movieNm; //제목
	private String content; //댓글
	private String writer; //댓 작성자
	private double score; // 댓 평점
	private String regdate; //댓 작성일자
	
	
	// 2.생성자
	public ReplyDTO() {} // 디폴트생성자
	
	public ReplyDTO(String movieNm, String content, String writer, double score, String regdate) {
		super();
		this.movieNm = movieNm;
		this.content = content;
		this.writer = writer;
		this.score = score;
		this.regdate = regdate;
	}
	//3. GETTER & SETTER
	public String getMovieNm() {
		return movieNm;
	}

	public String getContent() {
		return content;
	}

	public String getWriter() {
		return writer;
	}

	public double getScore() {
		return score;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setMovieNm(String movieNm) {
		this.movieNm = movieNm;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	//4. to string()

	@Override
	public String toString() {
		return "ReplyDTO [movieNm=" + movieNm + ", content=" + content + ", writer=" + writer + ", score=" + score
				+ ", regdate=" + regdate + "]";
	}

		
	
	
}
