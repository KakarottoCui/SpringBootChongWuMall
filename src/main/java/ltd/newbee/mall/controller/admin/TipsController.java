package ltd.newbee.mall.controller.admin;

import ltd.newbee.mall.entity.Tips;
import ltd.newbee.mall.service.TipsService;
import ltd.newbee.mall.util.Result;
import ltd.newbee.mall.util.ResultGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Objects;

@Controller
@RequestMapping("/admin/tips")
public class TipsController {
    @Resource
    private HttpServletRequest request;
    @Resource
    private TipsService tipsService;

    @GetMapping("/toEdit")
    public String toEdit() {
        request.setAttribute("path", "tips_edit");
        return "admin/tips_edit";
    }

    @ResponseBody
    @PostMapping("/config")
    public Result config(@RequestParam String content) {
        Boolean orUpdate = tipsService.createOrUpdate(content);
        if (orUpdate) {
            return ResultGenerator.genSuccessResult();
        }
        return ResultGenerator.genFailResult("更新失败！");
    }

    @ResponseBody
    @GetMapping({"/get"})
    public Result getTips() {
        Tips select = tipsService.select();
        return ResultGenerator.genSuccessResult(Objects.nonNull(select) ? select.getContent() : "");
    }
}
