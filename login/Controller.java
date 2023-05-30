package login;

import java.util.Collection;
import java.util.List;
import java.util.ResourceBundle;
import java.net.URL;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class Controller implements Initializable{
	
	// Table
    @FXML
    private TableView<TableData> tableView;
    
    // Columns
    @FXML
    private TableColumn idColumn, nameColumn, phoneColumn, carColumn, statusColumn;
    
    
    @Override
    public void initialize(URL location, ResourceBundle resourceBundle) {
//    	idColumn.setCellValueFactory(new PropertyValueFactory<TableData, String>("id"));
//    	nameColumn.setCellValueFactory(new PropertyValueFactory<TableData, String>("name"));
//    	phoneColumn.setCellValueFactory(new PropertyValueFactory<TableData, String>("phone"));
//    	carColumn.setCellValueFactory(new PropertyValueFactory<TableData, String>("car"));
//    	statusColumn.setCellValueFactory(new PropertyValueFactory<TableData, String>("status"));
//    	
    	
   
    	TableColumn idColumn=tableView.getColumns().get(0);
    	idColumn.setCellValueFactory(new PropertyValueFactory("id"));
		
		TableColumn nameColumn=tableView.getColumns().get(1);//테이블븅의 첫번째 컬럼을 생성한다.
		nameColumn.setCellValueFactory(new PropertyValueFactory("name"));//tableㅇ의 첫번째 컬럼을 strid와대응시킨다.
		
		
		TableColumn phoneColumn=tableView.getColumns().get(2);
		phoneColumn.setCellValueFactory(new PropertyValueFactory("phone"));
		
		TableColumn carColumn=tableView.getColumns().get(3);
		carColumn.setCellValueFactory(new PropertyValueFactory("car"));
		
		TableColumn statusColumn=tableView.getColumns().get(4);
		statusColumn.setCellValueFactory(new PropertyValueFactory("status"));
		
		private ObservableList<MemberDTO> data;
		MemberDAO dao = new MemberDAO();
    	Collection<MemberDTO> memList = dao.selectAll();
    	data = FXCollections.observableArrayList(memList);
    	
    	tableView.getItems().add(data);
		
		
		//for문 안에서 입출력에 사용할 직접만든 테이블 클래스를 선언 합니다. 
		TableData vtData = null;
		/*출력할 데이터의 갯수를 임의로 정했습니다.
		 * 실전에서는 보통 배열로 받습니다.
		 * 그래서 nCnt에 배열의 갯수를 넣으면 되겠습니다.
		 * 예> int nCnt = 배열명.length;
		 * 이렇게 하면 배열의 갯수만큼 처리 해서 출력해 줍니다.
		 * 지금 예제에서는 1000 이라 1000줄의 데이터가 생깁니다.
		 */
    	
		
//		int nCnt = 2;
//    	for (int i = 1; i <= nCnt; i++) { // 테이블들어갈 내용을 만드는 부분
//			
//			//컴럼의 갯수만큼 문자열 배열을 만들어 줍니다.
//			String[] strRecord = new String[5]; // 컬럼수가5개이다.
//						
//			/*각각의 부분에 출력할 데이터를 입력합니다.
//			 * 보통 배열로 받는 경우가 많아서 배열의 인자를 
//			 * 서로 매칭 해주면 되겠습니다.
//			 * 예) 
//			 * for(int j=0; j< strRecord.length;j++){
//			 * 		strRecord[0] = 입력데이터배열[j];
//			 * 		strRecord[1] = 입력데이터배열[j];
//			 * 					.
//			 * 					.
//			 * }
//			 */
//			strRecord[0] = ""+i;
//			strRecord[1] = ""+i;
//			strRecord[2] = ""+i;
//			strRecord[3] = ""+i;
//			strRecord[4] = ""+i;			
//
//			// TableData클래스의  데이터를 한번에 입력
//			//하면 생성자를 만들어 그것을 출력에 사용한다.
//			vtData = new TableData(strRecord);
//			tableView.getItems().add(vtData); 
		}
    	
    }
    
}
