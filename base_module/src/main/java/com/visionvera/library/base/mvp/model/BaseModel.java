/*
package com.visionvera.library.base.mvp.model;

import android.app.Activity;

import com.trello.rxlifecycle2.LifecycleProvider;
import com.trello.rxlifecycle2.LifecycleTransformer;
import com.trello.rxlifecycle2.android.ActivityEvent;
import com.trello.rxlifecycle2.android.FragmentEvent;
import com.visionvera.psychologist.base.bean.BaseResponseBean;
import com.visionvera.psychologist.base.bean.BaseResponseBean2;
import com.visionvera.psychologist.module.alarm.activity.InquiryReportStatusDetailActivity;
import com.visionvera.psychologist.module.alarm.bean.AlarmListRequestBean;
import com.visionvera.psychologist.module.alarm.bean.AlarmListResponseBean;
import com.visionvera.psychologist.module.alarm.bean.AlarmUpterInfoBean;
import com.visionvera.psychologist.module.alarm.bean.AreaDictTreeBean;
import com.visionvera.psychologist.module.alarm.bean.AreaDictTreeRequest;
import com.visionvera.psychologist.module.alarm.bean.IllnessClazzInfoListBean;
import com.visionvera.psychologist.module.alarm.bean.IllnessClazzInfoListRequest;
import com.visionvera.psychologist.module.alarm.bean.InquiryReportDetailBean;
import com.visionvera.psychologist.module.alarm.bean.NewAlarmBean;
import com.visionvera.psychologist.module.alarm.bean.NewAlarmRequest;
import com.visionvera.psychologist.module.alarm.bean.SaveMeetingRecordRequest;
import com.visionvera.psychologist.module.casecontrol.activity.TransferDeathActivity;
import com.visionvera.psychologist.module.casecontrol.bean.AddPatientRequestBean2;
import com.visionvera.psychologist.module.casecontrol.bean.FollowListRequestBean;
import com.visionvera.psychologist.module.casecontrol.bean.FollowListResponseBean;
import com.visionvera.psychologist.module.casecontrol.bean.LeaveHospitalListRequestBean;
import com.visionvera.psychologist.module.casecontrol.bean.LeaveHospitalListResponseBean;
import com.visionvera.psychologist.module.casecontrol.bean.MoveRecordListRequestBean;
import com.visionvera.psychologist.module.casecontrol.bean.MoveRecordListResponseBean;
import com.visionvera.psychologist.module.casecontrol.bean.NotManageToManageRequestBean;
import com.visionvera.psychologist.module.casecontrol.bean.PatientDetailRequestBean;
import com.visionvera.psychologist.module.casecontrol.bean.PatientDetailResponseBean;
import com.visionvera.psychologist.module.casecontrol.bean.PatientLIstRequestBean;
import com.visionvera.psychologist.module.casecontrol.bean.PatientListResponseBean;
import com.visionvera.psychologist.module.casecontrol.bean.PatientStatusStatisticsBean;
import com.visionvera.psychologist.module.casecontrol.bean.PreSelectsRequestBean;
import com.visionvera.psychologist.module.casecontrol.bean.PreSelectsResponseBean;
import com.visionvera.psychologist.module.followmanager.activity.FollowDetailActivity;
import com.visionvera.psychologist.module.followmanager.beans.FollowDetailBean;
import com.visionvera.psychologist.module.followmanager.beans.FollowDetailRequest;
import com.visionvera.psychologist.module.followmanager.beans.FollowListRequest;
import com.visionvera.psychologist.module.followmanager.beans.FollowNewRecordOptionBean;
import com.visionvera.psychologist.module.followmanager.beans.FollowNewRecordOptionRequest;
import com.visionvera.psychologist.module.followmanager.beans.FollowNewRecordRequest;
import com.visionvera.psychologist.module.followmanager.beans.FollowNewRecordSimpleRequest;
import com.visionvera.psychologist.module.followmanager.beans.NewFollowRecordBean;
import com.visionvera.psychologist.module.incidencereport.activity.IncidenceReportDetailActivity;
import com.visionvera.psychologist.module.incidencereport.bean.IllReportListRequestBean;
import com.visionvera.psychologist.module.incidencereport.bean.IllReportListResponseBean;
import com.visionvera.psychologist.module.incidencereport.bean.IncidenceReportDetailBean2;
import com.visionvera.psychologist.module.incidencereport.bean.NewIncidenceReportRequest;
import com.visionvera.psychologist.module.login.beans.GetSmsCodeRequestBean;
import com.visionvera.psychologist.module.login.beans.GetSmsCodeResponseBean;
import com.visionvera.psychologist.module.login.beans.LoginRequestBean;
import com.visionvera.psychologist.module.login.beans.LoginResponseBean;
import com.visionvera.psychologist.module.login.beans.RegisterRequestBean;
import com.visionvera.psychologist.module.message.beans.MessageDetailListRequestBean;
import com.visionvera.psychologist.module.message.beans.MessageDetailListResponseBean;
import com.visionvera.psychologist.module.message.beans.MessageTypeListRequestBean;
import com.visionvera.psychologist.module.message.beans.MessageTypeListResponseBean;
import com.visionvera.psychologist.module.move.activitys.LeaveHospitalDetailActivity;
import com.visionvera.psychologist.module.move.bean.LeaveHospitalBean;
import com.visionvera.psychologist.module.move.bean.LeaveHospitalDetailBean;
import com.visionvera.psychologist.module.move.bean.LeaveHospitalRequest;
import com.visionvera.psychologist.module.move.bean.MoveButtonOperationRequest;
import com.visionvera.psychologist.module.move.bean.MoveDetailBean;
import com.visionvera.psychologist.module.move.bean.MoveDetailRequest;
import com.visionvera.psychologist.module.move.bean.MoveOutListBean;
import com.visionvera.psychologist.module.move.bean.MoveOutListRequest;
import com.visionvera.psychologist.module.move.bean.NewLeaveHospitalBean;
import com.visionvera.psychologist.module.move.bean.NewLeaveHospitalRequest;
import com.visionvera.psychologist.module.move.bean.NewMoveOutBean;
import com.visionvera.psychologist.module.move.bean.NewMoveOutRequest;
import com.visionvera.psychologist.module.ordermanage.activitys.DoctorDetailActivity;
import com.visionvera.psychologist.module.ordermanage.activitys.OrderTimeActivity;
import com.visionvera.psychologist.module.ordermanage.activitys.SearchDoctorActivity;
import com.visionvera.psychologist.module.ordermanage.activitys.TimeTable2Activity;
import com.visionvera.psychologist.module.ordermanage.beans.DiagnosiModeListBean;
import com.visionvera.psychologist.module.ordermanage.beans.DoctorDetailBean;
import com.visionvera.psychologist.module.ordermanage.beans.DoctorListRequestBean;
import com.visionvera.psychologist.module.ordermanage.beans.DoctorListResponseBean;
import com.visionvera.psychologist.module.ordermanage.beans.HospitalListRequestBean;
import com.visionvera.psychologist.module.ordermanage.beans.HospitalListResponseBean;
import com.visionvera.psychologist.module.ordermanage.beans.OrderCancelRequestBean;
import com.visionvera.psychologist.module.ordermanage.beans.OrderConfirmRequestBean;
import com.visionvera.psychologist.module.ordermanage.beans.OrderDetailRequestBean;
import com.visionvera.psychologist.module.ordermanage.beans.OrderDetailResponseBean;
import com.visionvera.psychologist.module.ordermanage.beans.OrderListRequestBean;
import com.visionvera.psychologist.module.ordermanage.beans.OrderListResponseBean;
import com.visionvera.psychologist.module.ordermanage.beans.SearchDoctorBean;
import com.visionvera.psychologist.module.ordermanage.beans.SubjectListRequestBean;
import com.visionvera.psychologist.module.ordermanage.beans.SubjectListResponseBean;
import com.visionvera.psychologist.module.ordermanage.beans.SubmitOrderRequestBean;
import com.visionvera.psychologist.module.ordermanage.beans.TagListRequestBean;
import com.visionvera.psychologist.module.ordermanage.beans.TagListResponseBean;
import com.visionvera.psychologist.module.ordermanage.beans.TimeTableBean2;
import com.visionvera.psychologist.module.remoteconsultation.beans.RemoteConsultationConfirmRequestBean;
import com.visionvera.psychologist.module.remoteconsultation.beans.RemoteConsultationDetailRequestBean;
import com.visionvera.psychologist.module.remoteconsultation.beans.RemoteConsultationDetailResponseBean;
import com.visionvera.psychologist.module.remoteconsultation.beans.RemoteConsultationListRequestBean;
import com.visionvera.psychologist.module.remoteconsultation.beans.RemoteConsultationListResponseBean;
import com.visionvera.psychologist.module.set.bean.ChangePassRequest;
import com.visionvera.psychologist.module.set.bean.ForgetPasswordCheckNumberRequest;
import com.visionvera.psychologist.module.set.bean.ForgetPasswordCommitRequest;
import com.visionvera.psychologist.net.BaseApiService;
import com.visionvera.psychologist.net.RetrofitManager;
import com.visionvera.psychologist.util.MD5Utils;

import org.json.JSONObject;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

*/
/**
 * @author ?????????
 * @date 2018/12/23 0023 10:39
 * QQ:1052374416
 * telephone:18501231486
 * ??????:??????model???????????????????????????. model???????????????????????????????????????,????????????????????????.????????????????????????????????????.
 * common???????????????????????????.???????????????presenter?????????????????????model?????????,?????????????????????presenter?????????
 * ????????????????????????model. ???????????????,???????????????model???????????????,???????????????presenter???model???????????????.
 * ????????????:
 * <p>
 * ??????????????????
 * <p>
 * ?????????????????????????????????
 * @param lifecycleProvider
 * @param observer
 * <p>
 * ????????????-??????????????????
 * @return ??????????????????
 * <p>
 * ????????????----???????????????????????????options???????????????
 * <p>
 * ????????????
 * <p>
 * ????????????---??????????????????????????????
 * <p>
 * ????????????---??????????????????
 * <p>
 * ????????????---????????????????????????????????????
 * <p>
 * ??????????????????
 * <p>
 * ????????????
 * <p>
 * ??????????????????????????????
 * <p>
 * ????????????-??????????????????list??????
 * <p>
 * ??????????????????
 * <p>
 * ?????????????????????????????????????????????
 * <p>
 * ???????????????
 * <p>
 * ????????????-?????????????????????
 * <p>
 * ????????????-??????????????????????????????
 * <p>
 * ?????????????????????
 * <p>
 * ?????????????????????????????????????????????
 * <p>
 * ?????????????????????
 * <p>
 * ??????????????????????????????
 * <p>
 * ??????????????????
 * <p>
 * ??????????????????
 * <p>
 * ??????????????????
 * <p>
 * ?????????????????????
 * <p>
 * ??????-??????????????????-?????? ??? ???
 * <p>
 * ??????????????????
 * <p>
 * ????????????
 * <p>
 * ????????????????????????
 * <p>
 * ????????????-----??????????????????
 * <p>
 * ???????????????????????????
 * <p>
 * ????????????????????????
 * <p>
 * ????????????
 * <p>
 * ????????????----????????????
 * <p>
 * ?????????????????????????????????
 * <p>
 * ??????????????????????????????
 * <p>
 * ????????????
 * <p>
 * setting?????????
 * <p>
 * ??????????????????
 * <p>
 * ?????????????????????????????????
 * @param lifecycleProvider
 * @param observer
 * <p>
 * ????????????-??????????????????
 * @return ??????????????????
 * <p>
 * ????????????----???????????????????????????options???????????????
 * <p>
 * ????????????
 * <p>
 * ????????????---??????????????????????????????
 * <p>
 * ????????????---??????????????????
 * <p>
 * ????????????---????????????????????????????????????
 * <p>
 * ??????????????????
 * <p>
 * ????????????
 * <p>
 * ??????????????????????????????
 * <p>
 * ????????????-??????????????????list??????
 * <p>
 * ??????????????????
 * <p>
 * ?????????????????????????????????????????????
 * <p>
 * ???????????????
 * <p>
 * ????????????-?????????????????????
 * <p>
 * ????????????-??????????????????????????????
 * <p>
 * ?????????????????????
 * <p>
 * ?????????????????????????????????????????????
 * <p>
 * ?????????????????????
 * <p>
 * ??????????????????????????????
 * <p>
 * ??????????????????
 * <p>
 * ??????????????????
 * <p>
 * ??????????????????
 * <p>
 * ?????????????????????
 * <p>
 * ??????-??????????????????-?????? ??? ???
 * <p>
 * ??????????????????
 * <p>
 * ????????????
 * <p>
 * ????????????????????????
 * <p>
 * ????????????-----??????????????????
 * <p>
 * ???????????????????????????
 * <p>
 * ????????????????????????
 * <p>
 * ????????????
 * <p>
 * ????????????----????????????
 * <p>
 * ?????????????????????????????????
 * <p>
 * ??????????????????????????????
 * <p>
 * ????????????
 * <p>
 * setting?????????
 *//*

public class BaseModel implements IBaseModel {
    public class Common {

    }

    public class Login {
        public void login(String username, String password, String umengToken, LifecycleProvider lifecycleProvider, Observer<LoginResponseBean> observer) {
            LoginRequestBean requestBean = new LoginRequestBean();
            requestBean.username = username;
            requestBean.password = password;
            requestBean.clientId = umengToken;
            requestBean.mobileOs = "android";

            RetrofitManager.create(BaseApiService.class)
                    .login(requestBean)
                    //??????????????????
                    .compose(lifecycleProvider.<LoginResponseBean>bindToLifecycle())
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(observer);

        }
    }

    public class Register {
        public void getSmsCode(String mobile, int source, LifecycleProvider lifecycleProvider, Observer<GetSmsCodeResponseBean> observer) {
            GetSmsCodeRequestBean requestBean = new GetSmsCodeRequestBean();
            requestBean.mobile = mobile;
            requestBean.source = source;
            RetrofitManager.create(BaseApiService.class)
                    .getSmsCode(requestBean)
                    //??????????????????
                    .compose(lifecycleProvider.<GetSmsCodeResponseBean>bindToLifecycle())
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(observer);

        }

        public void register(String mobile, String password, int regFrom, String code,
                             LifecycleProvider lifecycleProvider,
                             Observer<BaseResponseBean> observer) {
            RegisterRequestBean requestBean = new RegisterRequestBean();
            requestBean.mobile = mobile;
            String md5 = MD5Utils.MD5(password);
            requestBean.password = md5;
            requestBean.regFrom = regFrom;
            requestBean.code = code;
            RetrofitManager.create(BaseApiService.class)
                    .register(requestBean)
                    //??????????????????
                    .compose(lifecycleProvider.<BaseResponseBean>bindToLifecycle())
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(observer);

        }
    }

    */
/**
 * ??????????????????
 *//*

    public class CaseControl {
        public void getPatientList(boolean isRefres, int pageNo, int pageSize, String startDate,
                                   String patientStatus, String diagnose,
                                   String diagnoseLevel,
                                   LifecycleProvider lifecycleProvider,
                                   Observer<PatientListResponseBean> observer) {
            PatientLIstRequestBean requestBean = new PatientLIstRequestBean();
            requestBean.setPageNo(pageNo);
            requestBean.setPageSize(pageSize);
            requestBean.setStartDate(startDate);
            requestBean.setPatientStatus(patientStatus);
            requestBean.setDiagnose(diagnose);
            requestBean.setDiagnoseLevel(diagnoseLevel);
            RetrofitManager.create(BaseApiService.class)
                    .getPatientList(requestBean)
                    //??????????????????
                    .compose(lifecycleProvider.<PatientListResponseBean>bindToLifecycle())
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(observer);

        }

        */
/**
 * ?????????????????????????????????
 *
 * @param lifecycleProvider
 * @param observer
 *//*



        public void getPreSelects(LifecycleProvider lifecycleProvider,
                                  Observer<PreSelectsResponseBean> observer) {
            PreSelectsRequestBean requestBean = new PreSelectsRequestBean();
            requestBean.add = "no";
            RetrofitManager.create(BaseApiService.class)
                    .getPreSelects(requestBean)
                    //??????????????????
                    .compose(lifecycleProvider.<PreSelectsResponseBean>bindToLifecycle())
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(observer);

        }


        public void searchPatientList(PatientLIstRequestBean requestBean,
                                      LifecycleProvider lifecycleProvider,
                                      Observer<PatientListResponseBean> observer) {

            LifecycleTransformer lifecycleTransformer ;
            if (lifecycleProvider instanceof Activity) {
                lifecycleTransformer = lifecycleProvider.bindUntilEvent(ActivityEvent.DESTROY);
            }else {
                lifecycleTransformer = lifecycleProvider.bindUntilEvent(FragmentEvent.DESTROY);
            }
            RetrofitManager.create(BaseApiService.class)
                    .getPatientList(requestBean)
                    .compose(lifecycleTransformer)
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(observer);
        }

        public void addPatient(AddPatientRequestBean2 requestBean, LifecycleProvider lifecycleProvider,
                               Observer<PreSelectsResponseBean> observer) {

            RetrofitManager.create(BaseApiService.class)
                    .addPatient(requestBean)
                    //??????????????????
                    .compose(lifecycleProvider.<PreSelectsResponseBean>bindToLifecycle())
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(observer);

        }

        public void getLeaveHospitalList(LeaveHospitalListRequestBean requestBean, LifecycleProvider lifecycleProvider,
                                         Observer<LeaveHospitalListResponseBean> observer) {

            RetrofitManager.create(BaseApiService.class)
                    .getLeaveHospitalList(requestBean)
                    //??????????????????
                    .compose(lifecycleProvider.<LeaveHospitalListResponseBean>bindToLifecycle())
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(observer);

        }

        public void getIllReportList(com.visionvera.psychologist.module.casecontrol.bean.IllReportListRequestBean requestBean, LifecycleProvider lifecycleProvider,
                                     Observer<com.visionvera.psychologist.module.casecontrol.bean.IllReportListResponseBean> observer) {

            RetrofitManager.create(BaseApiService.class)
                    .getIllReportList(requestBean)
                    //??????????????????
                    .compose(lifecycleProvider.<com.visionvera.psychologist.module.casecontrol.bean.IllReportListResponseBean>bindToLifecycle())
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(observer);

        }

        public void getFollowList(FollowListRequestBean requestBean, LifecycleProvider lifecycleProvider,
                                  Observer<FollowListResponseBean> observer) {

            RetrofitManager.create(BaseApiService.class)
                    .getFollowList(requestBean)
                    //??????????????????
                    .compose(lifecycleProvider.<FollowListResponseBean>bindToLifecycle())
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(observer);

        }

        */
/**
 * ????????????-??????????????????
 *
 * @return
 *//*

        public void getMoveRecordList(MoveRecordListRequestBean requestBean, LifecycleProvider lifecycleProvider,
                                      Observer<MoveRecordListResponseBean> observer) {

            RetrofitManager.create(BaseApiService.class)
                    .getMoveRecordList(requestBean)
                    //??????????????????
                    .compose(lifecycleProvider.<MoveRecordListResponseBean>bindToLifecycle())
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(observer);

        }

        */
/**
 * ??????????????????
 *//*

        public void getPatientStatusStatistics(LifecycleProvider lifecycleProvider,
                                               Observer<PatientStatusStatisticsBean> observer){

            RetrofitManager.create(BaseApiService.class)
                    .getPatientStatusNum()
                    //??????????????????
                    .compose(lifecycleProvider.bindUntilEvent(ActivityEvent.DESTROY))
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(observer);
        }


    }

    */
/**
 * ????????????----???????????????????????????options???????????????
 *//*

    public class FollowNewRecordOption {
        public void getFollowNewRecordOption(FollowNewRecordOptionRequest followNewRecordOptionRequest,
                                             LifecycleProvider lifecycleProvider,
                                             Observer<FollowNewRecordOptionBean> observer) {
            RetrofitManager.create(BaseApiService.class)
                    .getFollowNewRecordOption(followNewRecordOptionRequest)
                    .compose(lifecycleProvider.<FollowNewRecordOptionBean>bindToLifecycle())
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(observer);

        }

    }

    */
/**
 * ????????????
 *//*

    public class OrderManage {
        public void getOrderList(OrderListRequestBean requestBean,
                                 LifecycleProvider lifecycleProvider,
                                 Observer<OrderListResponseBean> observer) {
            LifecycleTransformer lifecycleTransformer;
            if (lifecycleProvider instanceof Activity) {
                lifecycleTransformer = lifecycleProvider.bindUntilEvent(ActivityEvent.DESTROY);
            } else {
                lifecycleTransformer = lifecycleProvider.bindUntilEvent(FragmentEvent.DESTROY);
            }
            RetrofitManager.create(BaseApiService.class)
                    .getOrderList(requestBean)
                    .compose(lifecycleTransformer)
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(observer);

        }

        public void getHospitalList(HospitalListRequestBean requestBean,
                                    LifecycleProvider lifecycleProvider,
                                    Observer<HospitalListResponseBean> observer) {
            RetrofitManager.create(BaseApiService.class)
                    .getHospitalList(requestBean)
                    .compose(lifecycleProvider.bindUntilEvent(ActivityEvent.DESTROY))
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(observer);

        }

        public void getSubjectList(SubjectListRequestBean requestBean,
                                   LifecycleProvider lifecycleProvider,
                                   Observer<SubjectListResponseBean> observer) {
            RetrofitManager.create(BaseApiService.class)
                    .getSubjectList(requestBean)
                    .compose(lifecycleProvider.<SubjectListResponseBean>bindToLifecycle())
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(observer);

        }

        public void getTagList(TagListRequestBean requestBean,
                               LifecycleProvider lifecycleProvider,
                               Observer<TagListResponseBean> observer) {
            RetrofitManager.create(BaseApiService.class)
                    .getTagList(requestBean)
                    .compose(lifecycleProvider.<TagListResponseBean>bindToLifecycle())
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(observer);

        }

        public void getDoctorList(DoctorListRequestBean requestBean,
                                  LifecycleProvider lifecycleProvider,
                                  Observer<DoctorListResponseBean> observer) {
            RetrofitManager.create(BaseApiService.class)
                    .getDoctorList(requestBean)
                    .compose(lifecycleProvider.<DoctorListResponseBean>bindToLifecycle())
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(observer);

        }

        public void getOrderDetail(OrderDetailRequestBean requestBean,
                                   LifecycleProvider lifecycleProvider,
                                   Observer<OrderDetailResponseBean> observer) {
            RetrofitManager.create(BaseApiService.class)
                    .getOrderDetail(requestBean)
                    .compose(lifecycleProvider.<OrderDetailResponseBean>bindToLifecycle())
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(observer);

        }

        public void cancel(OrderCancelRequestBean requestBean,
                           LifecycleProvider lifecycleProvider,
                           Observer<BaseResponseBean2> observer) {
            LifecycleTransformer lifecycleTransformer;
            if (lifecycleProvider instanceof Activity) {
                lifecycleTransformer = lifecycleProvider.bindUntilEvent(ActivityEvent.DESTROY);
            } else {
                lifecycleTransformer = lifecycleProvider.bindUntilEvent(FragmentEvent.DESTROY);
            }
            RetrofitManager.create(BaseApiService.class)
                    .orderCancel(requestBean)
                    .compose(lifecycleTransformer)
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(observer);

        }
        public void confirm( OrderConfirmRequestBean requestBean,
                            LifecycleProvider lifecycleProvider,
                            Observer<BaseResponseBean2> observer){
            LifecycleTransformer lifecycleTransformer ;
            if (lifecycleProvider instanceof Activity) {
                lifecycleTransformer = lifecycleProvider.bindUntilEvent(ActivityEvent.DESTROY);
            }else {
                lifecycleTransformer = lifecycleProvider.bindUntilEvent(FragmentEvent.DESTROY);
            }
            RetrofitManager.create(BaseApiService.class)
                    .orderConfirm(requestBean)
                    .compose(lifecycleTransformer)
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(observer);

        }

        public void saveMeetingRecord(SaveMeetingRecordRequest saveMeetingRecordRequest,
                                      LifecycleProvider lifecycleProvider,
                                      Observer<BaseResponseBean2> observer ){
            RetrofitManager.create(BaseApiService.class)
                    .saveMeetingRecord(saveMeetingRecordRequest)
                    .compose(lifecycleProvider.bindUntilEvent(ActivityEvent.DESTROY))
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(observer);
        }

    }

    */
/**
 * ????????????---??????????????????????????????
 *//*

    public class FollowRecordList {
        public void getFollowRecordList(FollowListRequest request,
                                        LifecycleProvider lifecycleProvider,
                                        Observer<com.visionvera.psychologist.module.followmanager.beans.FollowListBean> observer) {
            RetrofitManager.create(BaseApiService.class)
                    .getFollowRecordList(request)
                    .compose(lifecycleProvider.bindUntilEvent(ActivityEvent.DESTROY))
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(observer);

        }
    }


    */
/**
 * ????????????---??????????????????
 *//*

    public class NewFollowRecord {
        public void getNewFollowRecord(FollowNewRecordRequest followNewRecordRequest,
                                       LifecycleProvider lifecycleProvider, Observer<NewFollowRecordBean> observer) {
            RetrofitManager.create(BaseApiService.class)
                    .addFollowUpRecord(followNewRecordRequest)
                    .compose(lifecycleProvider.<NewFollowRecordBean>bindToLifecycle())
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(observer);
        }
    }

    */
/**
 * ????????????---????????????????????????????????????
 *//*

    public class NewFollowRecordSimple {
        public void getNewFollowRecordSimple(FollowNewRecordSimpleRequest followNewRecordSimpleRequest,
                                             LifecycleProvider lifecycleProvider, Observer<NewFollowRecordBean> observer) {
            RetrofitManager.create(BaseApiService.class)
                    .addFollowUpRecordSimple(followNewRecordSimpleRequest)
                    .compose(lifecycleProvider.<NewFollowRecordBean>bindToLifecycle())
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(observer);
        }
    }

    */
/**
 * ??????????????????
 *//*

    public class OrderConfirm {
        public void submit(SubmitOrderRequestBean requestBean,
                           LifecycleProvider lifecycleProvider,
                           Observer<BaseResponseBean2> observer) {

            RetrofitManager.create(BaseApiService.class)
                    .orderSubmit(requestBean)
                    .compose(lifecycleProvider.<BaseResponseBean2>bindToLifecycle())
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(observer);

        }

    }

    */
/**
 * ????????????
 *//*

 */
/* public class UploadImg{
        public void uploadImgFile(File imgFile,String prefix,String type,
                                  LifecycleProvider lifecycleProvider,
                                  Observable<UploadImgBean> observable){
            RetrofitManager.create(BaseApiService.class)
                    .uploadImg().
        }
    }*//*


 */
/**
 * ??????????????????????????????
 *//*


    public class NewAlarm {
        public void newAlarm(NewAlarmRequest newAlarmRequest,
                             LifecycleProvider lifecycleProvider,
                             Observer<NewAlarmBean> observer) {
            RetrofitManager.create(BaseApiService.class)
                    .newAlarm(newAlarmRequest)
                    .compose(lifecycleProvider.bindUntilEvent(ActivityEvent.DESTROY))
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(observer);
        }
    }


    */
/**
 * ????????????-??????????????????list??????
 *//*

    public class IllnessClazzInfoList {
        public void IllnessClazzInfoList(IllnessClazzInfoListRequest request,
                                         LifecycleProvider lifecycleProvider,
                                         Observer<IllnessClazzInfoListBean> observer) {
            RetrofitManager.create(BaseApiService.class)
                    .IllnessClazzInfoList(request)
                    .compose(lifecycleProvider.<IllnessClazzInfoListBean>bindToLifecycle())
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(observer);

        }
    }

    */
/**
 * ??????????????????
 *//*

    public class AreaDictTree {
        public void AreaDictTree(AreaDictTreeRequest areaDictTreeRequest,
                                 LifecycleProvider lifecycleProvider,
                                 Observer<AreaDictTreeBean> observer) {
            RetrofitManager.create(BaseApiService.class)
                    .AreaDictTree(areaDictTreeRequest)
                    .compose(lifecycleProvider.<AreaDictTreeBean>bindToLifecycle())
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(observer);
        }
    }

    */
/**
 * ?????????????????????????????????????????????
 *//*

    public class AlarmList {
        public void getAlarmList(AlarmListRequestBean requestBean,
                                 LifecycleProvider lifecycleProvider,
                                 Observer<AlarmListResponseBean> observer) {

            RetrofitManager.create(BaseApiService.class)
                    .getAlramList(requestBean)
                    .compose(lifecycleProvider.<AlarmListResponseBean>bindToLifecycle())
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(observer);

        }

    }

    */
/**
 * ???????????????
 *//*

    public class PatientDetail {
        public void getPatientDetail(PatientDetailRequestBean requestBean,
                                     LifecycleProvider lifecycleProvider,
                                     Observer<PatientDetailResponseBean> observer) {

            RetrofitManager.create(BaseApiService.class)
                    .getPatientDetail(requestBean)
                    .compose(lifecycleProvider.<PatientDetailRequestBean>bindToLifecycle())
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(observer);
        }
    }

    */
/**
 * ????????????-?????????????????????
 *//*

    public class SuperLevelPhoneNumber {
        public void getSuperLevelPhoneNumber(JSONObject object,
                                             LifecycleProvider lifecycleProvider,
                                             Observer<BaseResponseBean2> observer) {
            RetrofitManager.create(BaseApiService.class)
                    .getSuperLevelPhoneNumber(object)
                    .compose(lifecycleProvider.<BaseResponseBean2>bindToLifecycle())
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(observer);
        }
    }

    */
/**
 * ????????????-??????????????????????????????
 *//*

    public class UpterInfo {
        public void getUpterInfo(LifecycleProvider lifecycleProvider,
                                 Observer<AlarmUpterInfoBean> observer) {
            RetrofitManager.create(BaseApiService.class)
                    .getUpterInfo()
                    .compose(lifecycleProvider.bindUntilEvent(ActivityEvent.DESTROY))
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(observer);

        }

        public void newLongitudeAndLatitude(NewAlarmRequest newAlarmRequest,
                               LifecycleProvider lifecycleProvider,
                               Observer<NewAlarmBean> observer) {
            RetrofitManager.create(BaseApiService.class)
                    .newLongitudeAndLatitude(newAlarmRequest)
                    .compose(lifecycleProvider.bindUntilEvent(ActivityEvent.DESTROY))
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(observer);
        }

        public void saveMeetingRecord(SaveMeetingRecordRequest saveMeetingRecordRequest,
                                      LifecycleProvider lifecycleProvider,
                                      Observer<BaseResponseBean2> observer ){
            RetrofitManager.create(BaseApiService.class)
                    .saveMeetingRecord(saveMeetingRecordRequest)
                    .compose(lifecycleProvider.bindUntilEvent(ActivityEvent.DESTROY))
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(observer);
        }


    }


    */
/**
 * ?????????????????????
 *//*

    public class FollowRecordDetail {
        public void getFollowRecordDetail(FollowDetailRequest request,
                                          LifecycleProvider lifecycleProvider,
                                          Observer<FollowDetailBean> observer) {
            RetrofitManager.create(BaseApiService.class)
                    .getFollowRecordDetail(request)
                    .compose(lifecycleProvider.<FollowDetailBean>bindToLifecycle())
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(observer);
        }
    }

    */
/**
 * ?????????????????????????????????????????????
 *//*

    public class IllReportList {
        public void getList(IllReportListRequestBean requestBean,
                            LifecycleProvider lifecycleProvider,
                            Observer<IllReportListResponseBean> observer) {

            RetrofitManager.create(BaseApiService.class)
                    .getIllReportList(requestBean)
                    .compose(lifecycleProvider.bindUntilEvent(ActivityEvent.DESTROY))
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(observer);

        }

    }

    */
/**
 * ?????????????????????
 *//*

    public class MoveOutList {
        public void getMoveOutList(MoveOutListRequest moveListRequest,
                                   LifecycleProvider lifecycleProvider,
                                   Observer<MoveOutListBean> observer) {
            RetrofitManager.create(BaseApiService.class)
                    .getMoveList(moveListRequest)
                    .compose(lifecycleProvider.<MoveOutListBean>bindToLifecycle())
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(observer);
        }
    }


    */
/**
 * ??????????????????????????????
 *//*

    public class LeaveHospitalList {
        public void getLeaveHospitalList(LeaveHospitalRequest request,
                                         LifecycleProvider lifecycleProvider,
                                         Observer<LeaveHospitalBean> observer) {
            RetrofitManager.create(BaseApiService.class)
                    .getLeaveHospitalList(request)
                    .compose(lifecycleProvider.<LeaveHospitalBean>bindToLifecycle())
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(observer);
        }
    }


    */
/**
 * ??????????????????
 *//*

    public class NewIncidenceReport {
        public void getNewIncidenceReport(NewIncidenceReportRequest reportRequest,
                                          LifecycleProvider lifecycleProvider,
                                          Observer<BaseResponseBean2> observer) {
            RetrofitManager.create(BaseApiService.class)
                    .getAddillnessReport(reportRequest)
                    .compose(lifecycleProvider.<BaseResponseBean2>bindToLifecycle())
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(observer);
        }

    }

    */
/**
 * ??????????????????
 *//*

    public class NewLeaveHospital {
        public void getNewLeaveHospital(NewLeaveHospitalRequest request,
                                        LifecycleProvider lifecycleProvider,
                                        Observer<NewLeaveHospitalBean> observer) {
            RetrofitManager.create(BaseApiService.class)
                    .newLeaveHospital(request)
                    .compose(lifecycleProvider.bindUntilEvent(ActivityEvent.DESTROY))
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(observer);
        }
    }

    */
/**
 * ??????????????????
 *//*

    public class LeaveHospitalDetail {
        public void getLeaveHospitalDetail(LeaveHospitalDetailActivity.LeaveHospitalDetailRequest request,
                                           LifecycleProvider lifecycleProvider,
                                           Observer<LeaveHospitalDetailBean> observer) {
            RetrofitManager.create(BaseApiService.class)
                    .leaveHospitalDetail(request)
                    .compose(lifecycleProvider.<LeaveHospitalDetailBean>bindToLifecycle())
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(observer);
        }
    }

    */
/**
 * ?????????????????????
 *//*

    public class NewMoveOut {
        public void getNewMoveOut(NewMoveOutRequest request,
                                  LifecycleProvider lifecycleProvider,
                                  Observer<NewMoveOutBean> observer) {
            RetrofitManager.create(BaseApiService.class)
                    .newMoveOut(request)
                    .compose(lifecycleProvider.<NewMoveOutBean>bindToLifecycle())
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(observer);
        }
    }

    public class MoveOutDetail {

        public void getMoveOutDetail(MoveDetailRequest request,
                                     LifecycleProvider lifecycleProvider,
                                     Observer<MoveDetailBean> observer) {
            RetrofitManager.create(BaseApiService.class)
                    .getMoveDetail(request)
                    .compose(lifecycleProvider.bindUntilEvent(ActivityEvent.DESTROY))
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(observer);
        }
    }



    */
/**
 * ??????-??????????????????-?????? ??? ???
 *//*

    public class InquiryReportDetail {
        public void getInquiryReportDetail(InquiryReportStatusDetailActivity.InquiryReportDetailRequest request,
                                           LifecycleProvider lifecycleProvider,
                                           Observer<InquiryReportDetailBean> observer) {
            RetrofitManager.create(BaseApiService.class)
                    .getInquiryReportDetail(request)
                    .compose(lifecycleProvider.<InquiryReportDetailBean>bindToLifecycle())
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(observer);
        }
    }

    */
/**
 * ??????????????????
 *//*

    public class IncidenceReportDetail {
        public void getIncidenceReportDetail(IncidenceReportDetailActivity.IncidenceReportDetailRequest request,
                                             LifecycleProvider lifecycleProvider,
                                             Observer<IncidenceReportDetailBean2> observer) {
            RetrofitManager.create(BaseApiService.class)
                    .getIncidenceReportDetail(request)
                    .compose(lifecycleProvider.<IncidenceReportDetailBean2>bindToLifecycle())
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(observer);
        }
    }

    */
/**
 * ????????????
 *//*

    public class DoctorDetail {
        public void getDoctorDetail(DoctorDetailActivity.DoctorDetailRequest request,
                                    LifecycleProvider lifecycleProvider,
                                    Observer<DoctorDetailBean> observer) {
            RetrofitManager.create(BaseApiService.class)
                    .getDoctorDetail(request)
                    .compose(lifecycleProvider.<DoctorDetailBean>bindToLifecycle())
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(observer);
        }
    }

    */
/**
 * ????????????????????????
 *//*

    public class TimeTable {
        public void getTimeTable(TimeTable2Activity.TimeTableRequest request,
                                 LifecycleProvider lifecycleProvider,
                                 Observer<TimeTableBean2> observer) {
            RetrofitManager.create(BaseApiService.class)
                    .getTimeTable(request)
                    .compose(lifecycleProvider.<TimeTableBean2>bindToLifecycle())
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(observer);
        }
    }

    */
/**
 * ????????????-----??????????????????
 *//*

    public class DiagnosisMode {
        public void getDiagnosisMode(OrderTimeActivity.DiagnosisModeListRequest request,
                                     LifecycleProvider lifecycleProvider,
                                     Observer<DiagnosiModeListBean> observer) {
            RetrofitManager.create(BaseApiService.class)
                    .getDiagnosiModeList(request)
                    .compose(lifecycleProvider.<DiagnosiModeListBean>bindToLifecycle())
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(observer);
        }
    }

    */
/**
 * ???????????????????????????
 *//*

    public class TransferDeath {
        public void getTransferDeath(TransferDeathActivity.TransferDeathRequest request,
                                     LifecycleProvider lifecycleProvider,
                                     Observer<BaseResponseBean2> observer) {
            RetrofitManager.create(BaseApiService.class)
                    .getTransferDeath(request)
                    .compose(lifecycleProvider.bindUntilEvent(ActivityEvent.DESTROY))
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(observer);
        }
    }

    */
/**
 * ????????????????????????
 *//*

    public class MoveButtonOperation {
        public void getMoveButtonOperation(MoveButtonOperationRequest request,
                                           LifecycleProvider lifecycleProvider,
                                           Observer<BaseResponseBean2> observer) {
            RetrofitManager.create(BaseApiService.class)
                    .getMoveButtonOperation(request)
                    .compose(lifecycleProvider.bindUntilEvent(ActivityEvent.DESTROY))
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(observer);
        }
    }

    */
/**
 * ????????????
 *//*

    public class RemoteConsultation {
        public void getRemoteConsultationList(RemoteConsultationListRequestBean requestBean,
                                              LifecycleProvider lifecycleProvider,
                                              Observer<RemoteConsultationListResponseBean> observer) {
            LifecycleTransformer lifecycleTransformer;
            if (lifecycleProvider instanceof Activity) {
                lifecycleTransformer = lifecycleProvider.bindUntilEvent(ActivityEvent.DESTROY);
            } else {
                lifecycleTransformer = lifecycleProvider.bindUntilEvent(FragmentEvent.DESTROY);
            }
            RetrofitManager.create(BaseApiService.class)
                    .getRemoteConsultationList(requestBean)
                    .compose(lifecycleTransformer)
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(observer);

        }


        public void getRemoteConsultationDetail(RemoteConsultationDetailRequestBean requestBean,
                                                LifecycleProvider lifecycleProvider,
                                                Observer<RemoteConsultationDetailResponseBean> observer) {
            LifecycleTransformer lifecycleTransformer;
            if (lifecycleProvider instanceof Activity) {
                lifecycleTransformer = lifecycleProvider.bindUntilEvent(ActivityEvent.DESTROY);
            } else {
                lifecycleTransformer = lifecycleProvider.bindUntilEvent(FragmentEvent.DESTROY);
            }
            RetrofitManager.create(BaseApiService.class)
                    .getRemoteConsultationDetail(requestBean)
                    .compose(lifecycleTransformer)
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(observer);

        }

        public void confirm(RemoteConsultationConfirmRequestBean requestBean,
                            LifecycleProvider lifecycleProvider,
                            Observer<BaseResponseBean2> observer) {
            LifecycleTransformer lifecycleTransformer;
            if (lifecycleProvider instanceof Activity) {
                lifecycleTransformer = lifecycleProvider.bindUntilEvent(ActivityEvent.DESTROY);
            } else {
                lifecycleTransformer = lifecycleProvider.bindUntilEvent(FragmentEvent.DESTROY);
            }
            RetrofitManager.create(BaseApiService.class)
                    .remoteConsultationConfirm(requestBean)
                    .compose(lifecycleTransformer)
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(observer);

        }

    }


    */
/**
 * ????????????----????????????
 *//*

    public class SearchDoctor {
        public void getSearchDoctor(SearchDoctorActivity.SearchDoctorRequest request,
                                    LifecycleProvider lifecycleProvider,
                                    Observer<SearchDoctorBean> observer) {
            RetrofitManager.create(BaseApiService.class)
                    .searchDoctor(request)
                    .compose(lifecycleProvider.bindUntilEvent(ActivityEvent.DESTROY))
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(observer);
        }
    }

    */
/**
 * ?????????????????????????????????
 *//*

    public class FollowDetailDelete {
        public void getFollowDetailDelete(FollowDetailActivity.FollowDetailDeleteRequest request,
                                          LifecycleProvider lifecycleProvider,
                                          Observer<BaseResponseBean2> observer) {
            RetrofitManager.create(BaseApiService.class)
                    .followDetailDelete(request)
                    .compose(lifecycleProvider.bindUntilEvent(ActivityEvent.DESTROY))
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(observer);
        }
    }

    */
/**
 * ??????????????????????????????
 *//*

    public class NotManageToManage{
        public void getNotFollowToFollow(NotManageToManageRequestBean request,
                                         LifecycleProvider lifecycleProvider,
                                         Observer<BaseResponseBean2> observer) {
            LifecycleTransformer lifecycleTransformer;
            if (lifecycleProvider instanceof Activity) {
                lifecycleTransformer = lifecycleProvider.bindUntilEvent(ActivityEvent.DESTROY);
            } else {
                lifecycleTransformer = lifecycleProvider.bindUntilEvent(FragmentEvent.DESTROY);
            }
            RetrofitManager.create(BaseApiService.class)
                    .notManageToManage(request)
                    .compose(lifecycleTransformer)
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(observer);
        }
    }
    */
/**
 * ????????????
 *//*

    public class Message{

        public void getMessageTypeList( MessageTypeListRequestBean requestBean,
                            LifecycleProvider lifecycleProvider,
                            Observer<MessageTypeListResponseBean> observer){
            LifecycleTransformer lifecycleTransformer ;
            if (lifecycleProvider instanceof Activity) {
                lifecycleTransformer = lifecycleProvider.bindUntilEvent(ActivityEvent.DESTROY);
            }else {
                lifecycleTransformer = lifecycleProvider.bindUntilEvent(FragmentEvent.DESTROY);
            }
            RetrofitManager.create(BaseApiService.class)
                    .getMessageTypeList(requestBean)
                    .compose(lifecycleTransformer)
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(observer);
        }

        public void getMessageDetailList( MessageDetailListRequestBean requestBean,
                                        LifecycleProvider lifecycleProvider,
                                            Observer<MessageDetailListResponseBean> observer){
            LifecycleTransformer lifecycleTransformer ;
            if (lifecycleProvider instanceof Activity) {
                lifecycleTransformer = lifecycleProvider.bindUntilEvent(ActivityEvent.DESTROY);
            }else {
                lifecycleTransformer = lifecycleProvider.bindUntilEvent(FragmentEvent.DESTROY);
            }
            RetrofitManager.create(BaseApiService.class)
                    .getMessageDetailList(requestBean)
                    .compose(lifecycleTransformer)
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(observer);

        }
    }

    */
/**
 * setting?????????
 *//*

    public class Setting{
        public void getChangePass(ChangePassRequest requestBean,
                                  LifecycleProvider lifecycleProvider,
                                  Observer<BaseResponseBean2> observer){
            LifecycleTransformer lifecycleTransformer ;
            if (lifecycleProvider instanceof Activity) {
                lifecycleTransformer = lifecycleProvider.bindUntilEvent(ActivityEvent.DESTROY);
            }else {
                lifecycleTransformer = lifecycleProvider.bindUntilEvent(FragmentEvent.DESTROY);
            }
            RetrofitManager.create(BaseApiService.class)
                    .changePassword(requestBean)
                    .compose(lifecycleTransformer)
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(observer);
        }
    }


    public class ForgetPassword{
        public void getForgetPasswordCheckNumber(ForgetPasswordCheckNumberRequest request,
                                                 LifecycleProvider lifecycleProvider,
                                                 Observer<BaseResponseBean2> observer){
            LifecycleTransformer lifecycleTransformer ;
            if (lifecycleProvider instanceof Activity) {
                lifecycleTransformer = lifecycleProvider.bindUntilEvent(ActivityEvent.DESTROY);
            }else {
                lifecycleTransformer = lifecycleProvider.bindUntilEvent(FragmentEvent.DESTROY);
            }
            RetrofitManager.create(BaseApiService.class)
                    .forgetPasswordCheckNumber(request)
                    .compose(lifecycleTransformer)
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(observer);
        }

        public void getForgetPasswordCommit(ForgetPasswordCommitRequest request,
                                            LifecycleProvider lifecycleProvider,
                                            Observer<BaseResponseBean2> observer){

            LifecycleTransformer lifecycleTransformer ;
            if (lifecycleProvider instanceof Activity) {
                lifecycleTransformer = lifecycleProvider.bindUntilEvent(ActivityEvent.DESTROY);
            }else {
                lifecycleTransformer = lifecycleProvider.bindUntilEvent(FragmentEvent.DESTROY);
            }
            RetrofitManager.create(BaseApiService.class)
                    .forgetPasswordCommit(request)
                    .compose(lifecycleTransformer)
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(observer);


        }


    }

}
*/
