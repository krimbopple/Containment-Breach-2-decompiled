Function GUESSEDscaleentity_4%(arg0%, arg1#, arg2#, arg3#, arg4%)
    Local local0#
    Local local1#
    Local local2#
    local0 = (entityscalex(arg0, $00, 1.0) * arg1)
    local1 = (entityscaley(arg0, $00, 1.0) * arg2)
    local2 = (entityscalez(arg0, $00, 1.0) * arg3)
    entitybox(arg0, (-1.0 * local0), (local1 * (Float arg4)), (-1.0 * local2), (2.0 * local0), (2.0 * local1), (2.0 * local2))
    Return $00
End Function
