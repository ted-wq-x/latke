/**
 * Cron jobs service.
 * 定时任务，使用的是java Timer类，使用http get进行调用，访问路径为Latkes.getServer() + Latkes.getContextPath() + cron.getURL()
 * 也就是执行servlet
 */
package org.b3log.latke.cron;
