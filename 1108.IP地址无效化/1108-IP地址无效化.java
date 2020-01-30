class Solution {
    /**
     * reg
     */
    public String defangIPaddr(String address) {
        return address.replaceAll("\\.", "[.]");
    }
}