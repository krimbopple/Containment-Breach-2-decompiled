Function GUESSEDcreatemap_3%()
    Local local0%
    T2X0XXBX084 = (New ZBD64ZFF6)
    For local0 = $00 To $05 Step $01
        T2X0XXBX084\Field1[local0] = _CreateI2IMap()
        T2X0XXBX084\Field0[local0] = _CreateIntVector()
    Next
    Return $00
End Function
