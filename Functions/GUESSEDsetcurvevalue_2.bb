Function GUESSEDsetcurvevalue_2%()
    Local local0.DBXD0D0XD
    If (((X0X6XBXZD = Null) Lor (T202D662244 < millisecs())) <> 0) Then
        GUESSEDsetglobal_22(Null)
        T202D662244 = (millisecs() + $7530)
    EndIf
    For local0 = Each DBXD0D0XD
        local0\Field1 = curvevalue((Float local0\Field0), local0\Field1, 150.0)
    Next
    Return $00
End Function
