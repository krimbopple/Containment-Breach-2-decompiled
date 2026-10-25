Function GUESSEDsetcurvevalue_3%()
    Local local0#
    If (T484F2XDF = Null) Then
        Return $00
    EndIf
    local0 = 0.0
    If (GUESSEDgetglobal_3() <> 0) Then
        local0 = (GUESSEDcreatebank_4(T484F2XDF\Field8) * 100.0)
        TXXF6F02DB2[GUESSEDupdatedropitem()]\Field10\Field8 = $00
        If ((Int XZ0260X8X2\Field48) <> 0) Then
            TXXF6F02DB2[GUESSEDupdatedropitem()]\Field10\Field3 = (GUESSEDupdateitems_2() + $12C)
            TXXF6F02DB2[GUESSEDupdatedropitem()]\Field10\Field8 = $01
            TXXF6F02DB2[GUESSEDupdatedropitem()]\Field10\Field9 = (T484F2XDF\Field7 / 100.0)
        EndIf
    EndIf
    T484F2XDF\Field7 = curvevalue(local0, T484F2XDF\Field7, 9.0)
    Return $00
    Return $00
End Function
