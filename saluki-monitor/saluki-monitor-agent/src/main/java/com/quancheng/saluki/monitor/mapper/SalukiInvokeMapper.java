package com.quancheng.saluki.monitor.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.quancheng.saluki.monitor.domain.SalukiInvokeStatistics;

@Mapper
public interface SalukiInvokeMapper {

    int addInvoke(SalukiInvokeStatistics invoke);

    int truncateTable();

    List<SalukiInvokeStatistics> queryAllInvoke();

    List<SalukiInvokeStatistics> countInvoke(SalukiInvokeStatistics invoke);

    List<SalukiInvokeStatistics> countInvokeInfo(SalukiInvokeStatistics invoke);

    List<String> getMethodsByService(SalukiInvokeStatistics invoke);

    List<SalukiInvokeStatistics> countInvokeSuccessTopTen(SalukiInvokeStatistics invoke);

    List<SalukiInvokeStatistics> countInvokeFailureTopTen(SalukiInvokeStatistics invoke);

    List<SalukiInvokeStatistics> queryAllInvoke(SalukiInvokeStatistics invoke);
}
