Function GUESSEDcheckvalue_50%()
    If (GUESSEDcheckvalue_10($00, $3C) <> 0) Then
        GUESSEDupdatetxxf_5()
        GUESSEDupdatetxxf_2($01)
        GUESSEDupdatetxxf_2($02)
    EndIf
    If (GUESSEDcheckvalue_10($01, $1E) <> 0) Then
        GUESSEDsetentity_12()
        GUESSEDisentity_3()
    EndIf
    If (GUESSEDcheckvalue_10($03, $1E) <> 0) Then
        GUESSEDistxbfb_2()
    EndIf
    If (GUESSEDcheckvalue_10($02, $0A) <> 0) Then
        GUESSEDsettxxf_2()
    EndIf
    If (GUESSEDcheckvalue_10($05, $07) <> 0) Then
        GUESSEDistxbfb()
    EndIf
    If (GUESSEDcheckvalue_10($06, $07) <> 0) Then
        GUESSEDupdateentity_2($06)
    EndIf
    If (GUESSEDcheckvalue_10($07, $07) <> 0) Then
        GUESSEDupdateentity_2($07)
    EndIf
    Return $00
End Function
