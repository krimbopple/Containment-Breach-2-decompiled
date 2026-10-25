Function GUESSEDcheckvalue_16%(arg0#, arg1%, arg2#)
    If (arg1 <> 0) Then
        XZ0260X8X2\Field64 = max(140.0, XZ0260X8X2\Field64)
    EndIf
    DZ64X028\Field21 = min(max(((arg0 / ((((Float T8660BZ460\Field6) * 1.5) * (Float (arg1 = $00))) + 1.0)) / ((((Float T8660BZ460\Field7) * 1.5) * (Float arg1)) + 1.0)), DZ64X028\Field21), 3.0)
    DZ64X028\Field5 = (Int arg2)
    Return $00
End Function
