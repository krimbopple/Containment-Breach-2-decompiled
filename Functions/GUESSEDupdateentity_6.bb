Function GUESSEDupdateentity_6%(arg0.decals, arg1%)
    Local local0.TX2BF6X0FF4
    If (((GUESSEDupdateanimatenpc() = $00) Lor (GUESSEDupdatexdb() = $00)) <> 0) Then
        Return $00
    EndIf
    For local0 = Each TX2BF6X0FF4
        If (local0\Field13 > $01) Then
            blitz_TXXF80Z0FD00($0B)
            blitz_TXXF80Z0FD00(arg0\Field7)
            blitz_XB2Z2BB0460(entityx(arg0\Field0, $01, 1.0))
            blitz_XB2Z2BB0460(entityy(arg0\Field0, $01, 1.0))
            blitz_XB2Z2BB0460(entityz(arg0\Field0, $01, 1.0))
            blitz_T2DD0DZDD40(GUESSEDcallclamp_4(entitypitch(arg0\Field0, $01, 1.0), 10.0))
            blitz_T2DD0DZDD40(GUESSEDcallclamp_4(entityyaw(arg0\Field0, $01, 1.0), 10.0))
            blitz_T2DD0DZDD40(GUESSEDcallclamp_4(entityroll(arg0\Field0, $01, 1.0), 10.0))
            blitz_XB2Z2BB0460(arg0\Field9)
            blitz_XB2Z2BB0460(arg0\Field14)
            blitz_XB2Z2BB0460(arg0\Field3)
            blitz_XB2Z2BB0460(arg0\Field12)
            blitz_XB2Z2BB0460(arg0\Field5)
            blitz_TXXF80Z0FD00(arg0\Field8)
            blitz_TXXF80Z0FD00(arg0\Field13)
            blitz_TXXF80Z0FD00(arg0\Field11)
            blitz_XB2Z2BB0460(arg0\Field1)
            blitz_XB2Z2BB0460(arg0\Field2)
            blitz_TXXF80Z0FD00(arg1)
            MP_Send(local0\Field7, local0\Field25, $00, $01, $00)
        EndIf
    Next
    Return $00
End Function
