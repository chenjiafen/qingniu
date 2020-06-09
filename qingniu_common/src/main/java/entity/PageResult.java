package entity;

import java.util.List;

/**
 * @author tyler.chen
 * @date 2020/6/8 0:59
 *分页结果类
 */
public class PageResult<T> {
   private Long total;
   private List<T> rows;

   public PageResult(Long total, List<T> rows) {
      this.total = total;
      this.rows = rows;
   }

   public Long getTotal() {
      return total;
   }

   public void setTotal(Long total) {
      this.total = total;
   }

   public List<T> getRows() {
      return rows;
   }

   public void setRows(List<T> rows) {
      this.rows = rows;
   }
}
