Function GUESSEDgetentity_9%(arg0.items)
    Local local0%
    Local local1%
    Local local2%
    If (arg0\Field29 = $00) Then
        blitz_TXBFB002B8X0(arg0\Field27)
        blitz_TXXF80Z0FD00($01)
        blitz_XB2Z2BB0460(entityx(arg0\Field9, $00, 1.0))
        blitz_XB2Z2BB0460(entityy(arg0\Field9, $00, 1.0))
        blitz_XB2Z2BB0460(entityz(arg0\Field9, $00, 1.0))
        getentitylinearvelocity(arg0\Field9, local0, local1, local2)
        blitz_T2DD0DZDD40(GUESSEDcallclamp_4(local0, 50.0))
        blitz_T2DD0DZDD40(GUESSEDcallclamp_4(local1, 50.0))
        blitz_T2DD0DZDD40(GUESSEDcallclamp_4(local2, 50.0))
        getentityangularvelocity(arg0\Field9, local0, local1, local2)
        blitz_T2DD0DZDD40(GUESSEDcallclamp_4(local0, 50.0))
        blitz_T2DD0DZDD40(GUESSEDcallclamp_4(local1, 50.0))
        blitz_T2DD0DZDD40(GUESSEDcallclamp_4(local2, 50.0))
    EndIf
    Return $00
End Function
