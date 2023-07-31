package ltd.newbee.mall.controller.admin;

import ltd.newbee.mall.entity.CountHotGoods;
import ltd.newbee.mall.service.NewBeeMallOrderService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/admin/statistics")
public class StatisticsController {
    @Resource
    private HttpServletRequest request;
    @Resource
    private NewBeeMallOrderService newBeeMallOrderService;

    @GetMapping("/toStatistics")
    public String toStatistics() {
        request.setAttribute("path", "toStatistics");
        return "admin/statistics";
    }

    @ResponseBody
    @GetMapping("/getHottestGoods")
    public List<CountHotGoods> getHottestGoods() {
        return newBeeMallOrderService.getHottestGoods();
    }
}
